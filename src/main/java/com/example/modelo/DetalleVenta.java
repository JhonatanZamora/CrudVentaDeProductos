package com.example.modelo;

public class DetalleVenta extends Producto{

 private int cantidadProductos=0;

 private double subtotal=0.0;



 public int getCantidadProductos() {
  return cantidadProductos;
 }

 public void setCantidadProductos(int cantidadProductos) {
  this.cantidadProductos = cantidadProductos;
 }

 public double getSubtotal() {
  return subtotal;
 }

 public void setSubtotal(double subtotal) {
  this.subtotal = subtotal;
 }
}
