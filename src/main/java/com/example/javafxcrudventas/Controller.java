package com.example.javafxcrudventas;

import com.example.modelo.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    Aplicacion aplicacion;
    ObservableList<Cliente> listaClientesData = FXCollections.observableArrayList();

    @FXML
    private Button EliminarProducto;

    @FXML
    private MenuItem btn;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnActualizarProducto;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    private Button btnAgregarProducto;

    @FXML
    private Button btnAgregarTransaccion;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private Button btnEliminarTrasaccion;

    @FXML
    private Button btnGestionaTransaccion;

    @FXML
    private MenuItem btnJuridica;

    @FXML
    private MenuItem btnNatural;

    @FXML
    private Button btnNuevaVenta;

    @FXML
    private Button btnNuevoCliente;

    @FXML
    private Button btnNuevoProducto;

    @FXML
    private SplitMenuButton btnTipoPersona;

    @FXML
    private SplitMenuButton btnTipoProducto;

    @FXML
    private TableColumn<Cliente, String> columDireccion;

    @FXML
    private TableColumn<Cliente, String> columEmail;

    @FXML
    private TableColumn<Cliente, String> columFechaNacimiento;

    @FXML
    private TableColumn<Cliente, String> columIdentificacion;

    @FXML
    private TableColumn<Cliente, String> columNit;

    @FXML
    private TableColumn<Cliente, String> columNombre;

    @FXML
    private TableColumn<Cliente, String> columTelefono;

    @FXML
    private TableColumn<Cliente, String> columTipoPersona;

    @FXML
    private TableColumn<Cliente, String> columnApellido;

    @FXML
    private TableView<Cliente> tableClientes;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCantidadDeExistencia;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDescripcion;

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
    private TextField txtValorUnitario;

    @FXML
    void initialize() {
        this.columNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.columIdentificacion.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
        this.columDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.columTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.columTipoPersona.setCellValueFactory(new PropertyValueFactory<>("tipoCliente"));

        tableClientes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection,newSelection) -> {
        });


    }

    @FXML
    void NaturalAction(ActionEvent event) {

    }

    @FXML
    void actualizarClienteAction(ActionEvent event) {

    }

    @FXML
    void actualizarProductoAction(ActionEvent event) {

    }

    @FXML
    void agregarClienteAction(ActionEvent event) {

    }

    @FXML
    void agregarProductoAction(ActionEvent event) {

    }

    @FXML
    void agregarTransaccionAction(ActionEvent event) {

    }

    @FXML
    void eliminarClienteAction(ActionEvent event) {

    }

    @FXML
    void eliminarProductoAction(ActionEvent event) {

    }

    @FXML
    void eliminarTransaccionAction(ActionEvent event) {

    }

    @FXML
    void gestionarTransaccionAction(ActionEvent event) {

    }

    @FXML
    void juridicoAction(ActionEvent event) {

    }

    @FXML
    void nuevaVentaAction(ActionEvent event) {

    }

    @FXML
    void nuevoClienteAction(ActionEvent event) {

    }

    @FXML
    void nuevoProductoAction(ActionEvent event) {

    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
        tableClientes.getItems().clear();
        tableClientes.setItems(getListaClientesData());
    }

    public ObservableList<Cliente> getListaClientesData() {
        listaClientesData.addAll(aplicacion.obtenerClientes());
        return listaClientesData;
    }
}
