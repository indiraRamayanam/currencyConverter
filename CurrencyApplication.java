package com.SpringBoot.MyFirstApp.Currency;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyApplication {
    @RequestMapping(value="currencyApp", method=RequestMethod.GET)
    public String currency() {
        return "currency";
    }

    @RequestMapping(value="currencyApp", method=RequestMethod.POST)
    public String currencyPost(@RequestParam("india") double amount,@RequestParam("country") String cty, ModelMap model){
        double convertedAmount = convertCurrency(amount,cty);
        model.put("amount", amount);
        model.put("cty", cty);
        model.put("convertedAmount", convertedAmount);
        return "output";
    }
    public double convertCurrency(double amount,String cty){
        switch (cty){
            case "USA":return  amount /83;
            case "UK" :return  amount/100;
            case "KOREA":return  amount*16.53;
            case "JAPAN":return  amount*1.83;
            default:return amount;
        }
    }

}
