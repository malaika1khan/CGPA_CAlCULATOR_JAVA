package mynew.c;
import javax.swing.JOptionPane;
public class MynewC {
public static void main(String[] args) {
   int Total_Subjects=0;
  while(true)//To tackle the input errors in Total_Subjects
  {
      try{
          String st=JOptionPane.showInputDialog("Enter Total Number of subjects.");
          if(st==null)
          {
              JOptionPane.showMessageDialog(null,"Total number of Subjects cannot be null.");
          continue;
          }
      Total_Subjects=Integer.parseInt(st);
      if(Total_Subjects<=0){
          JOptionPane.showMessageDialog(null, "Total number of Subjects must be > 0.");}
      else 
      {
          break;
      }
      }
      catch(NumberFormatException e)
      {
          JOptionPane.showMessageDialog(null,"Error!Only numbers are allowed.");
      }}
      
 String [] sub_name= new String[Total_Subjects];//To store name of subjects

 float [] sub_marks=new float[Total_Subjects];//To store marks of the subjects
 float [] grade= new float[Total_Subjects];//To store the grade of the subjects
 double sumg=0;//for the sum of the grade
 for(int i=0;i<Total_Subjects;i++){
     sub_name[i]=JOptionPane.showInputDialog("Enter the name of subject" +(i+1)+":");
float marks=0;
while(true)//To tackle the invalid input from the user
{
    
    try{
        String marksinput1=JOptionPane.showInputDialog("Enter the marks of "+sub_name[i]+":");
        if(marksinput1==null){
            JOptionPane.showMessageDialog(null,"Marks cannot be null.");
        continue;}
        marks=Float.parseFloat(marksinput1);
        if(marks<0||marks>100){
            JOptionPane.showMessageDialog(null, "Marks should be between 0 to 100.");}
        else{
            break; }}
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Error!Only numbers are allowed.");}
    }

sub_marks[i]=marks;
if(sub_marks[i]>=80&&sub_marks[i]<=100)
    grade[i]= (float)4.0;
else if(sub_marks[i]>=70&&sub_marks[i]<80)
    grade[i]=(float) 3.5;
else if(sub_marks[i]>=60&&sub_marks[i]<70)
    grade[i]=(float) 3.0;
else if(sub_marks[i]>=50&&sub_marks[i]<60)
    grade[i]=(float) 2.5;
else if(sub_marks[i]>=40&&sub_marks[i]<50)
    grade[i]=(float) 2.0;
else if(sub_marks[i]>=0&&sub_marks[i]<40)
    grade[i]=(float) 0.0;
sumg=sumg+grade[i];
 }
 int c_credithours=0;
 while(true)//To tackle the input errors in c_credithours
  {
      try{
          String c=JOptionPane.showInputDialog("Enter  current credithours.");
          if(c==null)
          {
              JOptionPane.showMessageDialog(null," Current Credithours cannot be null.");
          continue;
          }
      c_credithours=Integer.parseInt(c);
      if(c_credithours<=0){
          JOptionPane.showMessageDialog(null, "Current credithours must be > 0.");}
      else 
      {
          break;
      }
      }
      catch(NumberFormatException e)
      {
          JOptionPane.showMessageDialog(null,"Error! Only numbers are allowed.");
      }}
      
 int p_credithours=0;
 while(true)//To tackle the input errors in c_credithours
  {
      try{
          String p=JOptionPane.showInputDialog("Enter  previous credithours.");
          if(p==null)
          {
              JOptionPane.showMessageDialog(null,"Previous credithours cannot be null.");
          continue;
          }
      p_credithours=Integer.parseInt(p);
      if(p_credithours<0){//can be zero for first semester students
          JOptionPane.showMessageDialog(null, "Previous credithours must be >=0.");}
      else 
      {
          break;
      }
      }
      catch(NumberFormatException e)
      {
          JOptionPane.showMessageDialog(null,"Error! Only numbers are allowed.");
      }}
 
float pcgpa=0;
while(true)//To tackle the input errors in previous CGPA
  {
      try{
          String pc=JOptionPane.showInputDialog("Enter the previous cgpa.");
          if(pc==null)
          {
              JOptionPane.showMessageDialog(null,"Previous CGPA cannot be null");
          continue;
          }
      pcgpa=Float.parseFloat(pc);
      if(pcgpa<0){//can be zero for first semester students
          JOptionPane.showMessageDialog(null," Error! Previous CGPA must be >= 0.");}
      else 
      {
          break;
      }
      }
      catch(NumberFormatException e)
      {
          JOptionPane.showMessageDialog(null,"Error!Only numbers are allowed.");
      }}
 double GPA=sumg/Total_Subjects;//current semester GPA
 double CGPA;
 if(p_credithours==0)
    CGPA=GPA;
 else{
CGPA=(pcgpa*p_credithours+GPA*c_credithours)/(p_credithours+c_credithours);}//cumulative GPA
 JOptionPane.showMessageDialog(null,"Your current CGPA "+ CGPA);
 JOptionPane.showMessageDialog(null,"Your semester GPA is " + GPA);
}}
