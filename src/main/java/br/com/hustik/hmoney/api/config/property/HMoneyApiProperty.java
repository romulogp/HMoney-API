package br.com.hustik.hmoney.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hmoney")
public class HMoneyApiProperty {

    private String originPermitida = "http://localhost:8000";
    private final Security security = new Security();

    public String getOriginPermitida() {
        return originPermitida;
    }

    public Security getSecurity() {
        return security;
    }

    public static class Security {

        private boolean enableHttps;

        public boolean isEnableHttps() {
            return enableHttps;
        }

        public void setEnableHttps(boolean enableHttps) {
            this.enableHttps = enableHttps;
        }

    }

}
