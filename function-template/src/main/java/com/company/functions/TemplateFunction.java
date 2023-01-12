package com.company.functions;

import com.company.models.TemplateRequest;
import com.company.models.TemplateResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.logging.Logger;

@Component
public class TemplateFunction implements Function<TemplateRequest, TemplateResponse> {

    private static final Logger LOG = Logger.getLogger(String.valueOf(TemplateFunction.class));

    @Override
    public TemplateResponse apply(TemplateRequest request) {
        TemplateResponse response = new TemplateResponse();
        response.setResult(request.getData());

        LOG.info("[INFO] " + response.getResult());

        return response;
    }
}
