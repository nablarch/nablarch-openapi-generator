package nablarch.tool.openapi.codegen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nablarch.tool.openapi.codegen.test.GeneratorAssertions;
import nablarch.tool.openapi.codegen.test.JavaNablarchJaxrsServerCodegenOpenApi30TestSupport;
import org.junit.Test;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

public class ValidationVariationTest extends JavaNablarchJaxrsServerCodegenOpenApi30TestSupport {
    @Test
    public void openapiStandardValidations() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("useBeanValidation", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("openapi-standard-validations.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ValidationsApi.java",
                "src/gen/java/org/openapitools/model/ValidationRequest.java",
                "src/gen/java/org/openapitools/model/ValidationSubRequest.java",
                "src/gen/java/org/openapitools/model/ValidationResponse.java"
        };

        // 生成されたファイルが存在することを確認
        GeneratorAssertions.assertExistsFiles(
                output,
                generatedFiles,
                mergeSupportFilesDocumentSpecifiedFiles(expectedGenerateFiles)
        );
        // 生成されたJavaソースコードが正しい構文であることを確認
        GeneratorAssertions.assertValidJavaSourceSyntax(generatedFiles);

        // サポートファイルを除いた生成されたファイルのリストを作成
        List<File> generatedFilesExcludeSupportFiles = excludeSupportFiles(generatedFiles);

        // 生成されたファイルと期待値を比較して、内容が一致することを確認
        for (File generateFile : generatedFilesExcludeSupportFiles) {
            GeneratorAssertions.assertEqualsFileContents(
                    generateFile,
                    getExpectedResourceFile(output, generateFile),
                    IGNORE_GENERATED_ANNOTATION_PATTERN
            );
        }
    }

    @Test
    public void conflictDomainValidation() {
        List<String> openApiDefinisions = List.of(
                "conflict-domain-validation-minimum.yaml",
                "conflict-domain-validation-maximum.yaml",
                "conflict-domain-validation-minLength.yaml",
                "conflict-domain-validation-maxLength.yaml",
                "conflict-domain-validation-minItems.yaml",
                "conflict-domain-validation-maxItems.yaml",
                "conflict-domain-validation-pattern.yaml"
        );

        for (String openApiDefinition : openApiDefinisions) {
            Map<String, Object> properties = new HashMap<>();
            properties.put("useBeanValidation", true);

            File output = createGeneratorOutputDirectory();

            CodegenConfigurator configurator = new CodegenConfigurator()
                    .setGeneratorName(GENERATOR_NAME)
                    .setAdditionalProperties(properties)
                    .setInputSpec(getTestClassResourcePath(openApiDefinition))
                    .setOutputDir(output.getAbsolutePath());

            ClientOptInput clientOptInput = configurator.toClientOptInput();
            DefaultGenerator generator = new DefaultGenerator();

            try {
                generator.opts(clientOptInput).generate();

                fail(String.format("An exception should be thrown when generating code from %s", openApiDefinition));
            } catch (RuntimeException e) {
                assertTrue(openApiDefinition, e.getMessage().contains("Please make sure that your schema is correct!"));

                assertTrue(openApiDefinition, e.getCause() instanceof UnsupportedOperationException);
                assertEquals(openApiDefinition, "When using Nablarch Domain Validation, it cannot be combined with [minimum, maximum, minLength, maxLength, minItems, maxItems, pattern]", e.getCause().getMessage());
            }
        }
    }

    @Test
    public void domainValidations() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("useBeanValidation", true);

        File output = createGeneratorOutputDirectory();

        CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(GENERATOR_NAME)
                .setAdditionalProperties(properties)
                .setInputSpec(getTestClassResourcePath("domain-validations.yaml"))
                .setOutputDir(output.getAbsolutePath());

        ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> generatedFiles = generator.opts(clientOptInput).generate();

        String[] expectedGenerateFiles = {
                "src/gen/java/org/openapitools/api/ValidationsApi.java",
                "src/gen/java/org/openapitools/model/ValidationRequest.java",
                "src/gen/java/org/openapitools/model/ValidationSubRequest.java",
                "src/gen/java/org/openapitools/model/ValidationResponse.java"
        };

        // 生成されたファイルが存在することを確認
        GeneratorAssertions.assertExistsFiles(
                output,
                generatedFiles,
                mergeSupportFilesDocumentSpecifiedFiles(expectedGenerateFiles)
        );
        // 生成されたJavaソースコードが正しい構文であることを確認
        GeneratorAssertions.assertValidJavaSourceSyntax(generatedFiles);

        // サポートファイルを除いた生成されたファイルのリストを作成
        List<File> generatedFilesExcludeSupportFiles = excludeSupportFiles(generatedFiles);

        // 生成されたファイルと期待値を比較して、内容が一致することを確認
        for (File generateFile : generatedFilesExcludeSupportFiles) {
            GeneratorAssertions.assertEqualsFileContents(
                    generateFile,
                    getExpectedResourceFile(output, generateFile),
                    IGNORE_GENERATED_ANNOTATION_PATTERN
            );
        }
    }
}
