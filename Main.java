package com.company;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) throws ScriptException {
        int n = 6;
        int r = 4;

        int sonuc = faktoriyelbul(n)/faktoriyelbul(n-r);

        System.out.print(sonuc);
    }

    private static int faktoriyelbul(int bulunacaksayi) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");


        String islem = "";
        for (int i = 1; i < bulunacaksayi+1; i++) { //Bu for döngüsü işlemi hazırlamak için yapılıyor
            islem = islem+i+"*";
        }
        islem = islem.substring(0,islem.length()-1); //Bu substring işlemi algoritmanın doğru çalışmasını sağlamakta
        Object result = engine.eval(islem); //Veri işleniyor ve bilgiye dönüştürülüyor
        return (int) result; //Bilgi kullanıcıya aktarılıyor
    }
}
