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
public class RectangleTest
{
   public static void main(String[] args)
   {
      Rectangle rectangle = new Rectangle();
         rectangle.setLength(4.0);
         rectangle.setWidth(3.0);
      System.out.println(rectangle.getLength() * rectangle.getWidth());
   }
}
