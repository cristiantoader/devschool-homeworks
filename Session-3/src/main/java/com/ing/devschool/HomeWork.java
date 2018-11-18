package com.ing.devschool;

import com.beust.jcommander.JCommander;
import com.ing.devschool.args.HomeWorkParams;

public class HomeWork {

    public static void main(String[] args) {
        HomeWorkParams inputParams = new HomeWorkParams();

        JCommander parser = JCommander.newBuilder()
                .addObject(inputParams)
                .build();

        // example --input-path asd --input-format csv --output-path dsa
        parser.parse(args);

        if (inputParams.isHelp()) {
            parser.usage();
            return;
        }

        new HomeWork().process(inputParams);
    }

    public void process(HomeWorkParams inputParams) {
        // todo:
        System.out.println(inputParams);
    }
}
