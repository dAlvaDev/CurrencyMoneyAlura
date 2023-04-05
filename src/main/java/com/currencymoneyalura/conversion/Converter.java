package com.currencymoneyalura.conversion;

import com.currencymoneyalura.model.Output;
import com.currencymoneyalura.model.TKCurrency;

import java.util.Set;

public interface Converter {
    Output convert(TKCurrency from, TKCurrency to);

    Set<TKCurrency> getAllCurrencies();
}
