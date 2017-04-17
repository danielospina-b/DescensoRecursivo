/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcom;

/**
 *
 * @author 2120166
 */
public class Aritmetica {
    TokenStack ts;
    char token;
    
    public Aritmetica() {
        ts = FileReader.read();
    }
}
