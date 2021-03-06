package bo;

import model.CustomerDTO;
import model.ItemDTO;
import model.OrderDetailDTO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface PurchaseOrderBO {

    boolean purchaseOrder(String orderId, String orderDate, String customerId, BigDecimal orderTotal, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException;

    CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;

    ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;

    boolean checkItemIsAvailable(String code) throws SQLException, ClassNotFoundException;

    boolean checkCustomerIsAvailable(String id) throws SQLException, ClassNotFoundException;

    String generateNewOrderID() throws SQLException, ClassNotFoundException;

    ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

}
