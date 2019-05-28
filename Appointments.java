//import javax.sql.rowset.BaseRowSet;
import javax.swing.*;


public class Appointments {

    public static void main (String [] args) {

        Database_ap appointments = new Database_ap(50000);
        JOptionPane.showMessageDialog(null, "Welcome in appointment system");
        boolean process = true;
        int deletedAppointments =0;
        int currentAppointments =0;
        while (process) {
            String input = JOptionPane.showInputDialog( "1. Add new appointment \n " +
                                                        "2. Delete appointment \n " +
                                                        "3. View all appointments\n"+
                                                        "4. Finish appointments\n"+
                                                        "0. Exit");
                                                        
       
            if (input.equals("1")) {
                String name = JOptionPane.showInputDialog("Name of person:");
                int day = new Integer(JOptionPane.showInputDialog("Day of appointment:")).intValue();
                int month = new Integer(JOptionPane.showInputDialog("Month of appointment:")).intValue();
                int year = new Integer(JOptionPane.showInputDialog("Year of appointment:")).intValue();
                int hour = new Integer(JOptionPane.showInputDialog("Hour of appointment:")).intValue();
                int minutes = new Integer(JOptionPane.showInputDialog("Minutes of product:")).intValue();
               
               int id = day+month+year+hour+minutes;
               
               String date = day+"/"+month+"/"+year;
               String time = hour+":"+minutes;
           
               if(appointments.find(new Key_ap(id))!=null){
                     JOptionPane.showMessageDialog(null,"You can not schedule a meeting on this hour, you have already an appointment");
                    
                    }
                   Record_ap meets = new Record_ap(new Key_ap(id), name, date, time);
                     appointments.insert(meets); 

                                         }
                     
             
            if (input.equals("2")){
                JOptionPane.showMessageDialog(null,"Type the day,month,year,hour and minutes to delete the appointment:");
                int dayy = new Integer(JOptionPane.showInputDialog("Day of appointment:")).intValue();
                int monthh = new Integer(JOptionPane.showInputDialog("Month of appointment:")).intValue();
                int yearr = new Integer(JOptionPane.showInputDialog("Year of appointment:")).intValue();
                int hourr = new Integer(JOptionPane.showInputDialog("Hour of appointment:")).intValue();
                int minutess = new Integer(JOptionPane.showInputDialog("Minutes of product:")).intValue();
                
                int idd = dayy+monthh+yearr+hourr+minutess;
                 
               appointments.delete(new Key_ap(idd));
               deletedAppointments++;
               System.out.println(deletedAppointments);

            }

              
            if (input.equals("3")){
            
                for (int i = 1; i <= 50000; i++ )
                
                { 
                  
                    Record_ap app = appointments.find(new Key_ap(i));
                    if (app != null){ 
               
                        System.out.println("Name: "+app.getName()+"  ID of appointment: "+i+" -- Data: "+app.getDate()+
                                " -- Ora: "+app.getHour());                    }
                }
            }
             if (input.equals("4")){
                JOptionPane.showMessageDialog(null,"Type the day,month,year,hour and minutes to finish the appointment:");
                int dayyy = new Integer(JOptionPane.showInputDialog("Day of appointment:")).intValue();
                int monthhh = new Integer(JOptionPane.showInputDialog("Month of appointment:")).intValue();
                int yearrr = new Integer(JOptionPane.showInputDialog("Year of appointment:")).intValue();
                int hourrr = new Integer(JOptionPane.showInputDialog("Hour of appointment:")).intValue();
                int minutesss = new Integer(JOptionPane.showInputDialog("Minutes of product:")).intValue();
                
                int iddd = dayyy+monthhh+yearrr+hourrr+minutesss;

              
               Record_ap app = appointments.find(new Key_ap(iddd)); 
               if(app != null){ deletedAppointments++;
               JOptionPane.showMessageDialog(null,"Current appointments \n This appointment is finished "+app.getName() +app.getDate()+app.getHour()+"\n Number of deleted appointment " +deletedAppointments );
                appointments.delete(new Key_ap(iddd));
               
                 
                           
                for (int i = 1; i <= 50000; i++ )
                
                { 
                  
                    Record_ap app1 = appointments.find(new Key_ap(i));
                    if (app1 != null){ currentAppointments ++;
               
                      JOptionPane.showMessageDialog(null,"Name: "+app1.getName()+"  ID of appointment: "+i+" -- Data: "+app1.getDate()+
                                " -- Ora: "+app1.getHour()+" Number of current appointments"+currentAppointments);                    }
                          
                }

               }
               }




            if (input.equals("0"))
            {   JOptionPane.showMessageDialog(null, "You choose to exit! ");
                process = false; }


        }
    }
}