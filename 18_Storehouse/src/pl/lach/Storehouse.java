package pl.lach;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storehouse {

    private Map<String, Integer> productsInStorehouse;

    public Storehouse(List<String> dataFromCsv) {
        productsInStorehouse = prepareProducts(dataFromCsv);
    }

    private Map<String, Integer> prepareProducts(List<String> dataFromCsv) {
        Map<String, Integer> products = new HashMap<>();
        for (String product : dataFromCsv) {
            String[] split = product.split(";");
            products.put(split[0], Integer.valueOf(split[1]));
        }
        return products;
    }

    public String showStorehouseState() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> product : productsInStorehouse.entrySet()) {
            stringBuilder.append(product.getKey() + " (" + product.getValue() + ") " + calculateStorehouseFill(product.getValue()) + "\n");
        }

        return stringBuilder.toString();
    }

    private String calculateStorehouseFill(Integer value) {
        StringBuilder stringBuilder = new StringBuilder();
        long result = Math.round((value / 10.0));
        for (int i = 0; i < result; i++) {
            stringBuilder.append("*");
        }
        return stringBuilder.toString();
    }
}
