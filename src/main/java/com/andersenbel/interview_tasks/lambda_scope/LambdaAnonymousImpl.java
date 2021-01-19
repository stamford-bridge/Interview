package com.andersenbel.interview_tasks.lambda_scope;

/**
 * @author Alexey Adamovich on 14.01.2021
 */
public class LambdaAnonymousImpl {

    private String value = "Enclosing scope value";

    public String scopeExperiment() {
        LambdaAnonymous anonymous = new LambdaAnonymous() {
            String value = "Anonymous class value";

            @Override
            public String experiment() {
                return this.value;
            }
        };

        String resultAnonymous = anonymous.experiment();

        LambdaAnonymous lambda = () -> {
            String value = "Lambda value";
            return this.value;
        };

        String resultLambda = lambda.experiment();

        return "Result anonymous scope: " + resultAnonymous
                + "\nResult lambda scope: " + resultLambda;
    }
}
