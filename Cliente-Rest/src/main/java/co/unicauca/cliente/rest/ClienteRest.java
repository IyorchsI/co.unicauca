/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.unicauca.cliente.rest;

import co.unicauca.cliente.NewJerseyClient;

/**
 *
 * @author JARMX
 */
public class ClienteRest {

    public static void main(String[] args) {
        // CREANDO UN ESTUDIANTE
        NewJerseyClient jersey = new NewJerseyClient();
        String rta = jersey.create_JSON(new Product(5, "Nevera Lg", 4000000d));
        System.out.println("Rta " + rta);
        // BUSCANDO UN PRODUCTO
        Product product = jersey.findById(Product.class, "1");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        // PROBAR LOS DEMAS SERVICIOS
    }
}
