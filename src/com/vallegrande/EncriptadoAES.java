package com.vallegrande;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EncriptadoAES {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            final String claveEncriptacion = "secreto!";
            String datosOriginales = "";
            
            EncriptadorAES encriptador = new EncriptadorAES();
            String encriptado = encriptador.encriptar(datosOriginales, claveEncriptacion);
            String desencriptado = encriptador.desencriptar(encriptado, claveEncriptacion);

            //Encriptar
            System.out.println("Ingrese el Texto a Encriptar");
            datosOriginales = entrada.nextLine();
            System.out.println("Texto Original: " + datosOriginales);
            System.out.println("Escriptado     : " + encriptado);

            //Desencriptar
            System.out.println("Ingrese el texto a Desencriptar");
            encriptado = entrada.nextLine();
            System.out.println("Texto Original: " + encriptado);
            System.out.println("Desencriptado  : " + datosOriginales);

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(EncriptadoAES.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
