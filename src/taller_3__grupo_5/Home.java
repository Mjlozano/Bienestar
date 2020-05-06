package taller_3__grupo_5;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus Lozano
 */
public class Home extends javax.swing.JFrame {

    String nombre;
    int codigo;
    Statement st = null;
    ResultSet rs = null;
    static private Connection conn;
    static ConexionMySQL SQL;

    public Home() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tipo_tabla = new javax.swing.JComboBox<>();
        tipo_accion = new javax.swing.JComboBox<>();
        codtxt = new javax.swing.JTextField();
        nombretxt = new javax.swing.JTextField();
        nombreRegLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        queryBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        aplicar = new javax.swing.JButton();
        queryButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        codpadre = new javax.swing.JTextField();
        codpadreLabel = new javax.swing.JLabel();
        searchHijos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(679, 420));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));

        tipo_tabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tabla Hijo", "Tabla Padre" }));
        tipo_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_tablaActionPerformed(evt);
            }
        });

        tipo_accion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insertar Registro", "Eliminar Registro", "Actualizar Registro" }));
        tipo_accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_accionActionPerformed(evt);
            }
        });

        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });

        nombreRegLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombreRegLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreRegLabel.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");

        queryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listado de padres", "Padres sin hijos", "Niños sin padre", "Padre con el numero de hijos" }));
        queryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliga consulta a realizar:");

        aplicar.setText("Aplicar Acción");
        aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarActionPerformed(evt);
            }
        });

        queryButton.setText("Consultar");
        queryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menú");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        codpadreLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        codpadreLabel.setForeground(new java.awt.Color(255, 255, 255));
        codpadreLabel.setText("Codigo de padre (Si tiene):");

        searchHijos.setText("Buscar hijos");
        searchHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHijosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(queryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreRegLabel)
                            .addComponent(tipo_accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codpadre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codpadreLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aplicar))
                    .addComponent(jLabel3))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_accion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreRegLabel))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codtxt)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codpadreLabel)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codpadre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        result.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(result);
        result.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consultas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel5)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarActionPerformed
        //Aplica la accion dependiendo de los parametros seleccionados
        if (codtxt.getText() == "") {

        } else {

        }

        String codigo = codtxt.getText();
        String nombre = "'" + nombretxt.getText() + "'";

        if (tipo_tabla.getSelectedIndex() == 1 && tipo_accion.getSelectedIndex() == 0) {

            if (codtxt.getText().isEmpty() || nombretxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "¡Ingrese todos los datos!",
                        "Advertencía",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                insertarPadre(codigo, nombre);
                if (queryBox.getSelectedIndex() == 0) {
                    queryButtonActionPerformed(evt);
                }
            }

        } else if (tipo_tabla.getSelectedIndex() == 0 && tipo_accion.getSelectedIndex() == 0) {

            if (codtxt.getText().isEmpty() || nombretxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "¡Ingrese todos los datos!",
                        "Advertencía",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                insertarHijo(codigo, nombre);
            }
        } else if (tipo_tabla.getSelectedIndex() == 0 && tipo_accion.getSelectedIndex() == 1) {

            if (codtxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "¡El codigo no puede ir vacio!",
                        "Advertencía",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                eliminarHijo(codigo);
            }
        } else if (tipo_tabla.getSelectedIndex() == 1 && tipo_accion.getSelectedIndex() == 1) {

            if (codtxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "¡El codigo no puede ir vacio!",
                        "Advertencía",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                eliminarPadre(codigo);
                if (queryBox.getSelectedIndex() == 0) {
                    queryButtonActionPerformed(evt);
                }
            }
        } else if (tipo_tabla.getSelectedIndex() == 0 && tipo_accion.getSelectedIndex() == 2) {

            if (codtxt.getText().isEmpty() || nombretxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "¡Ingrese todos los datos!",
                        "Advertencía",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                actualizarHijo(codigo, nombre);
            }
        } else if (tipo_tabla.getSelectedIndex() == 1 && tipo_accion.getSelectedIndex() == 2) {

            if (codtxt.getText().isEmpty() || nombretxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "¡Ingrese todos los datos!",
                        "Advertencía",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                actualizarPadre(codigo, nombre);
                if (queryBox.getSelectedIndex() == 0) {
                    queryButtonActionPerformed(evt);
                }
            }

        }
        clean();

    }//GEN-LAST:event_aplicarActionPerformed

    private void tipo_accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_accionActionPerformed
        //Desactiva el textField de nombre cuando se elige eliminar registro
        if (tipo_accion.getSelectedIndex() == 1) {
            nombretxt.setEnabled(false);
            nombreRegLabel.setSize(0, 0);
            nombretxt.setSize(0, 0);
            System.out.println("Eligio eliminar registro");
        } else {
            nombretxt.setEnabled(true);
            nombretxt.setSize(142, 35);
            nombreRegLabel.setSize(47, 17);
            nombreRegLabel.setVisible(true);
        }
    }//GEN-LAST:event_tipo_accionActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void queryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButtonActionPerformed
        switch (queryBox.getSelectedIndex()) {
            case 0:
                try {
                    st = conn.createStatement();
                    rs = st.executeQuery("SELECT * FROM padre");
                    createModel();
                } catch (Exception e) {
                }
                break;
            case 1:
                try {
                    st = conn.createStatement();
                    rs = st.executeQuery("Select *\n"
                            + "from padre as p left outer join hijo as h on p.id=h.hijode\n"
                            + "where hijode is null");
                    createModel();
                } catch (Exception e) {
                }
                break;
            case 2:
                try {
                    st = conn.createStatement();
                    rs = st.executeQuery("Select * from hijo where hijode is null;");
                    createModel();
                } catch (Exception e) {
                }
                break;
            case 3:
                try {
                    st = conn.createStatement();
                    rs = st.executeQuery("Select p.id, p.nombre, count(hijode)\n"
                            + "from padre as p left outer join hijo as h on p.id=h.hijode\n"
                            + "group by p.id");
                    createModel1(true);
                } catch (Exception e) {
                }
                break;
            default:
                System.out.println("¿Como lo hiciste?");
                break;
        }

    }//GEN-LAST:event_queryButtonActionPerformed

    private void queryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryBoxActionPerformed
        if (queryBox.getSelectedIndex() == 0) {
            searchHijos.setSize(113, 23);
            searchHijos.setEnabled(true);
        } else {
            searchHijos.setSize(0, 0);
            searchHijos.setEnabled(false);
        }
    }//GEN-LAST:event_queryBoxActionPerformed

    private void searchHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHijosActionPerformed
        try {
            int xd = (int) result.getValueAt(result.getSelectedRow(), 0);
            System.out.println(xd);
            st = conn.createStatement();
            rs = st.executeQuery("select id, nombre from hijo where hijo.hijode = " + String.valueOf(xd));
            createModel();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchHijosActionPerformed

    private void tipo_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_tablaActionPerformed
        if (tipo_tabla.getSelectedIndex() == 0) {
            codpadre.setSize(149, 32);
            codpadre.setEnabled(true);
            codpadreLabel.setSize(149, 17);
        } else {
            codpadre.setSize(0, 0);
            codpadre.setEnabled(false);
            codpadreLabel.setSize(0, 0);
        }
    }//GEN-LAST:event_tipo_tablaActionPerformed
    void insertarPadre(String codigo, String nombre) { //Ingresa un nuevo padre a la tabla
        try {
            st = conn.createStatement();
            st.executeUpdate("insert into padre values(" + codigo + ", " + nombre + ")");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void insertarHijo(String codigo, String nombre) { //Ingresa un nuevo hijo a la tabla
        try {
            String idpadre = "null";
            st = conn.createStatement();
            if (!codpadre.getText().isEmpty()) {
                idpadre = codpadre.getText();
            }
            st.executeUpdate("insert into hijo values(" + codigo + ", " + nombre + ", " + idpadre + ")");
            System.out.println("We good");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void eliminarHijo(String codigo) {
        try {
            st = conn.createStatement();
            st.executeUpdate("delete from hijo where hijo.id = " + codigo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void eliminarPadre(String codigo) {
        try {
            st = conn.createStatement();
            st.executeUpdate("delete from padre where padre.id = " + codigo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void actualizarPadre(String codigo, String nombre) {
        try {
            st = conn.createStatement();
            st.executeUpdate("update padre set nombre = " + nombre + "where id = " + codigo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void actualizarHijo(String codigo, String nombre) {
        try {
            st = conn.createStatement();
            st.executeUpdate("update hijo set nombre = " + nombre + "where id = " + codigo);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    void clean() {
        nombretxt.setText("");
        codtxt.setText("");
        codpadre.setText("");
    }

    public void createModel() {
        int rowN = 0;
        try {
            if (rs.last()) {
                rowN = rs.getRow();
                System.out.println(rowN);
                rs.first();
                rs.previous();
            }

            DefaultTableModel ModeloTabla = (DefaultTableModel) result.getModel();
            ModeloTabla.setRowCount(rowN);
            ModeloTabla.setColumnCount(0);
            ModeloTabla.addColumn("Id");
            ModeloTabla.addColumn("Nombre");

            int cont = 0;
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");

                //Display values
                System.out.print("ID: " + id);
                ModeloTabla.setValueAt(id, cont, 0);
                System.out.println(", Nombre: " + nombre);
                ModeloTabla.setValueAt(nombre, cont, 1);
                cont++;
            }
            rs.close();
            result.setModel(ModeloTabla);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void createModel1(boolean tercera) {

        int rowN = 0;
        try {
            if (rs.last()) {
                rowN = rs.getRow();
                System.out.println(rowN);
                rs.first();
                rs.previous();
            }

            DefaultTableModel ModeloTabla = (DefaultTableModel) result.getModel();
            ModeloTabla.setRowCount(rowN);
            ModeloTabla.setColumnCount(0);
            ModeloTabla.addColumn("Id");
            ModeloTabla.addColumn("Nombre");
            ModeloTabla.addColumn("N° de hijos");

            int cont = 0;
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int c = rs.getInt("count(hijode)");
                //Display values
                ModeloTabla.setValueAt(id, cont, 0);
                ModeloTabla.setValueAt(nombre, cont, 1);
                ModeloTabla.setValueAt(c, cont, 2);
                cont++;
            }
            rs.close();
            result.setModel(ModeloTabla);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SQL = new ConexionMySQL();
        conn = SQL.conectarMySQL();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicar;
    private javax.swing.JTextField codpadre;
    private javax.swing.JLabel codpadreLabel;
    private javax.swing.JTextField codtxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreRegLabel;
    private static javax.swing.JTextField nombretxt;
    private javax.swing.JComboBox<String> queryBox;
    private javax.swing.JButton queryButton;
    private javax.swing.JTable result;
    private javax.swing.JButton searchHijos;
    private static javax.swing.JComboBox<String> tipo_accion;
    private javax.swing.JComboBox<String> tipo_tabla;
    // End of variables declaration//GEN-END:variables
}
