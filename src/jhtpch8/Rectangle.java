/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jhtpch8;

/**
 *
 * @author miltonbennett
 */
public class Rectangle 
{
   private double length;
   private double width;

   public Rectangle()
   {
      this.length = 1.0;
      this.width = 1.0;
   }

   public void setLength(double length)
   {
      if (length < 0.0 || length > 20.0)
        throw new IllegalArgumentException("length must be between 0.0 and 20.0");
      this.length = length;
   }

   public double getLength()
   {
      return length;
   }

   public void setWidth(double width)
   {
      if (width < 0.0 || width > 20.0)
        throw new IllegalArgumentException("width must be between 0.0 and 20.0");
      this.width = width;
   }

   public double getWidth()
   {
      return width;
   }

   public double area(double length, double width)
   {
      return length * width;
   }

}