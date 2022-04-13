package com.schoolofnet.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornJsEngine {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine nashorn = manager.getEngineByName("nashorn");

        try {
            nashorn.eval("print('hello will');");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
