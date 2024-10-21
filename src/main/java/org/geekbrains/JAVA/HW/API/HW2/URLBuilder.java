package org.geekbrains.JAVA.HW.API.HW2;

public class URLBuilder {
    public static void main(String[] args) {
        System.out.println(buildURL("https://example.com/search", "query=java&sort=desc&filter=null"));

    }

    public static String buildURL(String baseURL, String params) {
        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");
        for (int i = 0; i < pairs.length; i++) {
            String[] key = pairs[i].split("=");
            if (!"null".equals((key[1]))) {
                if (!baseURL.contains("?")) {
                    url.append("?");
                }
                if (i > 0) {
                    url.append("&");
                }
                url.append(key[0]).append("=").append(key[1]);
            }
        }
        return url.toString();
    }
}
