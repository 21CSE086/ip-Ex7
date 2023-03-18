/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class sprt extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          String s=request.getParameter("c");
        ArrayList<String>sports=new ArrayList<>();
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1><center> TEAM DETAILS </center></h1>");
        if(s.equals("Chennai Super Kings"))
      {
      sports.add("The team has 12 members");
            sports.add("Ms.Dhoni");
             sports.add(" ");
            sports.add("Ravindra Jdeja ");
             sports.add(" ");
            sports.add("Suresh Raina");
             sports.add(" ");
            sports.add("Sam Curren");
             sports.add(" ");
            sports.add("Negidi");
             sports.add(" ");
            sports.add("Watson");
             sports.add(" ");
            sports.add("Rayudu");
             sports.add(" ");
            sports.add("Bens Stokes");
             sports.add(" ");
            sports.add("");
             sports.add("Deepak Chahar");
            sports.add("");
             sports.add("Ruturaj");
            sports.add("");
             sports.add("Convay ");
            sports.add("");
             sports.add("Santner");
                 sports.add(" ");
      }
      else if(s.equals("Mumbai Indians"))
       {
            sports.add("The team has 12 memebers");
            sports.add("Rohit Sharma ");
            sports.add("");
             sports.add("ishan kishan");
            sports.add(" ");
             sports.add("Bumrah");
            sports.add(" ");
             sports.add("Cameron");
            sports.add("");
             sports.add("S yadav");
            sports.add("");
             sports.add("Pollard");
            sports.add("");
             sports.add("Archer");
            sports.add("");
             sports.add("M Ashwin");
            sports.add("");
             sports.add("Sams");
            sports.add("");
             sports.add("Krunal Pandya");
            sports.add("");
             sports.add("Trent Boult");
            sports.add("");
             sports.add("Lynn");
            sports.add("");
             sports.add(" ");
       }
      else if(s.equals("Royal changellers Bengaluru"))
      {
          sports.add("The team has 12 members");
            sports.add("Virat ");
            sports.add("");
             sports.add("faf");
            sports.add(" ");
             sports.add("Chahal");
            sports.add(" ");
             sports.add("Maxwell");
            sports.add("");
             sports.add("Patel");
            sports.add("");
             sports.add("Finn");
            sports.add("");
             sports.add("Siraj");
            sports.add("");
             sports.add("AB de");
            sports.add("");
             sports.add("Dinesh Karthik");
            sports.add("");
             sports.add("Josh Hazlewood");
            sports.add("");
             sports.add("David Willey");
            sports.add("");
             sports.add("Akash Deep");
            sports.add("");
             
      }
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sprt</title>");            
            out.println("</head>");
            out.println("<body>");
            for(String st:sports){
                out.println(st+"<br>");
            }
            out.println("<h1>Servlet sprt at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
