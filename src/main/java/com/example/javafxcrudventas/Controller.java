package com.example.javafxcrudventas;

        import java.net.URL;
        import java.util.ResourceBundle;

        import com.example.modelo.*;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.control.cell.PropertyValueFactory;

        import javax.swing.*;


public class Controller {
    private  ObservableList<ClienteNatural> clienteNaturalBd;
    private  ObservableList<ClienteJuridico> clienteJuridicoBd;
    private  ObservableList<ProductoPerecedero> productoPerecederoBd;
    private  ObservableList<ProductoEnvasado> productoEnvasadoBd;
    private  ObservableList<ProductoRefrigerado> productoRefrigeradoBd ;
    Transacion transaciones ;
    ClienteNatural natural;
    ClienteJuridico clienteJuridico;
    ProductoEnvasado envasado ;
    ProductoPerecedero perecedero ;
    ProductoRefrigerado refrigerado ;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarC;

    @FXML
    private Button btnAgregarC;

    @FXML
    private Button btnEliminarC;

    @FXML
    private Button btnNuevoC;

    @FXML
    private SplitMenuButton btnTipoPersona;

    @FXML
    private TableColumn columIdentificacion;

    @FXML
    private TableColumn columnApellido;

    @FXML
    private TableColumn columnDireccion;

    @FXML
    private TableColumn  columnEmail;

    @FXML
    private TableColumn columnFechaNacimiento;


    @FXML
    private TableColumn  columnNit;

    @FXML
    private TableColumn  columnNombre;

    @FXML
    private TableColumn columnTelefono;

    @FXML
    private TableColumn columnTipoPersona;

    @FXML
    private TableView<ClienteNatural> tableClientes;


    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFechaNacimiento;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtNit;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;


    @FXML
    private Button btnActualizarP;

    @FXML
    private Button btnAgregarP;

    @FXML
    private Button btnEliminarP;

    @FXML
    private Button btnNuevoP;
    @FXML
    private TableColumn<ProductoEnvasado, String> columCodigo;

    @FXML
    private TableColumn<ProductoEnvasado, String> columnNombreProducto;

    @FXML
    private TableColumn<ProductoEnvasado,Double> columnValorUnitario;

    @FXML
    private TableColumn<ProductoEnvasado,Integer> columnCantidadExistencia;

    @FXML
    private TableColumn<ProductoEnvasado,String> columnTipoProducto;


    @FXML
    void actualizarClienteAction(ActionEvent event) {

    }

    @FXML
    void agregarClienteAction(ActionEvent event) {


        
    }

    @FXML
    void eliminarClienteAction(ActionEvent event) {

    }

    @FXML
    void nuevoClienteAction(ActionEvent event) {
        try
        {

            natural.setTipoPersona("Natural");
            natural.setNombre(txtNombre.getText());
            natural.setIdentificacion(txtIdentificacion.getText());
            natural.setTelefono(txtTelefono.getText());
            natural.setApellido(txtApellido.getText());
            natural.setDireccion(txtDireccion.getText());
            natural.setEmail(txtEmail.getText());
            natural.setFechaNacimiento(txtFechaNacimiento.getText());
            if (!this.clienteNaturalBd.contains(natural))
            {
                clienteNaturalBd.add(natural);
                this.tableClientes.setItems(clienteNaturalBd);
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("EROOR");
                alert.setContentText("CLIENTE AGREGADO");
                alert.showAndWait();
            }
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("EROOR");
                alert.setContentText("USUARIO YA EXISTE");
                alert.showAndWait();
            }
        }catch (Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("EROOR");
            alert.setContentText("FORMATO INCORRECTO");
            alert.showAndWait();
        }
    }

    @FXML
    void NaturalAction(ActionEvent event){
  txtNit.setEditable(false);
        txtFechaNacimiento.setEditable(true);
        txtEmail.setEditable(true);



    }
    @FXML
    void juridicoAction(ActionEvent event){
        txtNit.setEditable(true);
        txtFechaNacimiento.setEditable(false);
        txtEmail.setEditable(false);


    }

    @FXML
    void agregarProductoAction(ActionEvent event){

    }
    @FXML
    void actualizarProductoAction(ActionEvent event){

    }
    @FXML
    void nuevoProductoAction(ActionEvent event){

    }
    @FXML
    void eliminarProductoAction(ActionEvent event){

    }

    @FXML
    void initialize() {
        assert btnActualizarC != null : "fx:id=\"btnActualizar\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert btnAgregarC != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert btnEliminarC != null : "fx:id=\"btnEliminar\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert btnNuevoC != null : "fx:id=\"btnNuevo\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert btnTipoPersona != null : "fx:id=\"btnTipoPersona\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columIdentificacion != null : "fx:id=\"columIdentificacion\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columnApellido != null : "fx:id=\"columnApellido\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columnDireccion != null : "fx:id=\"columnDireccion\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columnEmail != null : "fx:id=\"columnEmail\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columnFechaNacimiento != null : "fx:id=\"columnFechaNacimiento\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columnNit != null : "fx:id=\"columnNit\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columnNombre != null : "fx:id=\"columnNombre\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columnTelefono != null : "fx:id=\"columnTelefono\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert columnTipoPersona != null : "fx:id=\"columnTipoPersona\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert tableClientes != null : "fx:id=\"tableClientes\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert txtDireccion != null : "fx:id=\"txtDireccion\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert txtFechaNacimiento != null : "fx:id=\"txtFechaNacimiento\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert txtIdentificacion != null : "fx:id=\"txtIdentificacion\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert txtNit != null : "fx:id=\"txtNit\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        assert txtTelefono != null : "fx:id=\"txtTelefono\" was not injected: check your FXML file 'EmpresaVentaProductosView.fxml'.";
        try
        {
            clienteNaturalBd = FXCollections.observableArrayList();
            clienteJuridicoBd = FXCollections.observableArrayList();
            productoPerecederoBd = FXCollections.observableArrayList();
            productoEnvasadoBd = FXCollections.observableArrayList();
            productoRefrigeradoBd = FXCollections.observableArrayList();
            clienteJuridico = new ClienteJuridico();
            envasado = new ProductoEnvasado();
            perecedero = new ProductoPerecedero();
            refrigerado = new ProductoRefrigerado();
            transaciones = new Transacion();
            natural = new ClienteNatural();
            this.columnNombre.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("nombre"));
            this.columnApellido.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("apellido"));
            this.columIdentificacion.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("identificacion"));
            this.columnDireccion.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("direccion"));
            this.columnTelefono.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("telefono"));
            this.columnEmail.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("email"));
            this.columnFechaNacimiento.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("fechaNacimiento"));
            /*this.columnNit.setCellValueFactory(new PropertyValueFactory<ClienteJuridico,String>("Nit"));
            this.columnNombre.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("nombre"));
            this.columnNombre.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("nombre"));
            this.columnNombre.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("nombre"));
            this.columnNombre.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("nombre"));*/

        }catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Hay un error");
        }



    }

}
