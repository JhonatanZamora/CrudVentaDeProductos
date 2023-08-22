package com.example.javafxcrudventas;

import com.example.modelo.Cliente;
import com.example.modelo.DetalleVenta;
import com.example.modelo.Producto;
import com.example.modelo.Venta;
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

    Venta ventas = new Venta();

    DetalleVenta detalleVenta = new DetalleVenta();
    ObservableList<Cliente> listaClientesData = FXCollections.observableArrayList();

    ObservableList<Venta> listaVentas = FXCollections.observableArrayList();

    ObservableList<DetalleVenta> listadetalles = FXCollections.observableArrayList();

    ObservableList<Producto> listaProductos = FXCollections.observableArrayList();

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
    private TableColumn<Venta, String> columnClienteV;

    @FXML
    private TableColumn<Venta, String> columnCodigoProductoV;

    @FXML
    private TableColumn<Venta, String> columnIVA;

    @FXML
    private TableColumn<Venta, String> columnTotal;

    @FXML
    private TableColumn<Venta, String> columnFecha;

    @FXML
    private TableColumn<Venta, DetalleVenta> columnDetalles;

    @FXML
    private TableColumn<Venta, DetalleVenta> columnCantidad;

    @FXML
    private TableColumn<Venta, DetalleVenta> columnProductoV;

    @FXML
    private TableColumn<Venta, DetalleVenta> columnSubtotal;

    @FXML
    private TableView<Venta> tableVenta;

    @FXML
    private TableView<DetalleVenta> tableDetalleVenta;
    @FXML
    private TextField txtNombre;

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
    private TextField txtNombreProducto;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtValorUnitario;

    @FXML
    private TextField txtCodigoP;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtCantidadProductos;

    @FXML
    private TextField txtIdCliente;

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
        this.columnClienteV.setCellValueFactory(new PropertyValueFactory<>("Cliente"));
        this.columnCodigoProductoV.setCellValueFactory(new PropertyValueFactory<>("Codigo Producto"));
        this.columnIVA.setCellValueFactory(new PropertyValueFactory<>("IVA"));
        this.columnTotal.setCellValueFactory(new PropertyValueFactory<>("Total"));
        this.columnFecha.setCellValueFactory(new PropertyValueFactory<>("Fecha"));

        this.columnCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        this.columnProductoV.setCellValueFactory(new PropertyValueFactory<>("Producto"));
        this.columnSubtotal.setCellValueFactory(new PropertyValueFactory<>("Subtotal"));

        tableVenta.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection,newSelection) -> {


        });
        tableDetalleVenta.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection,newSelection) -> {


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
        ventas.setCodigoP(txtCodigoP.getText());
        ventas.setFecha(txtFecha.getText());
        ventas.obtenerClientev(txtIdCliente.getText(),listaClientesData);
        detalleVenta.setCantidadProductos(Integer.parseInt(txtCantidadProductos.getText()));
        detalleVenta.calcularSubtotal(ventas.getCodigoP(), listaProductos);
        ventas.calcularIvaAplicado(detalleVenta.getSubtotal());
        detalleVenta.setCantidadProductos(Integer.parseInt(txtCantidadProductos.getText()));
        ventas.calcularTotalCompra(detalleVenta.getSubtotal());
        detalleVenta.setProductoVendido(ventas.getCodigoP(), listaProductos);
        listaVentas.add(ventas);
        listadetalles.add(detalleVenta);

        tableVenta.setItems(listaVentas);
        tableDetalleVenta.setItems(listadetalles);

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
