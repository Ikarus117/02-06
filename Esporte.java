import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Esporte {
   public static void main(String x []){
      
      String[] colunas = {"Nome", "Idade", "Esportes"};
      
      Object[][] dados = {
         {"Pedro", 14, "Volei"},
         {"Kevin", 15, "Basquete"},
         {"Icaro", 20, "Basquete"},
         {"Junior", 19, "Futebol"}
      };
      
      TableModel model = new ExibicaoPersonalizadaTableModel (dados, colunas);
      
      JTable table = new JTable (model);
      
      setComboxBox(table, model);
      JScrollPane scrollPane = new JScrollPane(table);
      JFrame frame = new JFrame ();
      frame.getContentPane().add(scrollPane);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.pack();
      frame.setVisible(true);
      
   }
   
   public static void setComboBox(JTable table, TableModel model){
      JComboBox <String> comboBox = new JComboBox<>();
      comboBox.addItem("Futebol");
      comboBox.addItem("Basquete");
      comboBox.addItem("Boxe");
      comboBox.addItem("Volei");
      comboBox.addItem("Golf");
      comboBox.addItem("Futebol Americano");
      comboBox.addItem("Atletismo");
      TableColumn column = table.getColumnModel().getColumn (model.getColumnCount() - 1);
      column.setCellEditor (new DefaultCellEditor(comboBox));
   }
}