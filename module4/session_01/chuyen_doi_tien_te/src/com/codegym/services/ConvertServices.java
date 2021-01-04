package com.codegym.services;

import org.springframework.stereotype.Service;

@Service
public class ConvertServices implements IConvertServices {

    @Override
    public double convert(double vnd) {
        return vnd/23000;
    }
}
