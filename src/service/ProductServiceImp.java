package service;

import model.Category;
import model.DBConnect;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImp implements ProductService {


    //get chit tiet chua viet xong
    @Override
    public Product getProductDetail(String productId) {
        Connection connection = DBConnect.getConnection();

        String sql = "select * from product where ProductID = '" + productId + "'";

        Product product = new Product();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getString("catagoryId"));
                product.setProductId(rs.getString("productId"));
                product.setCategoryName("catagory");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public List<Product> getListProduct() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "select * from atagvn.product";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> products = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductId(rs.getString("ProductID"));
            product.setCategoryId(rs.getString("CategoryId"));
            product.setProductName(rs.getString("ProductName"));
            product.setProductPrice(rs.getFloat("ProductPrice"));
            product.setQuantityInStock(rs.getInt("QuantityInStock"));
            product.setImage(rs.getString("Image"));
            product.setStatus(rs.getInt("Status"));
            product.setDescription(rs.getString("Description"));
            products.add(product);
        }
        return products;
    }


    public List<Product> getListProduct(String categoryId) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "select * from atagvn.product where CategoryId = '" + categoryId + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> products = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductId(rs.getString("ProductID"));
            product.setCategoryId(rs.getString("CategoryId"));
            product.setProductName(rs.getString("ProductName"));
            product.setProductPrice(rs.getFloat("ProductPrice"));
            product.setQuantityInStock(rs.getInt("QuantityInStock"));
            product.setImage(rs.getString("Image"));
            product.setStatus(rs.getInt("Status"));
            product.setDescription(rs.getString("Description"));
            products.add(product);
        }
        return products;
    }


    public List<Product> getListProductIP() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "select atagvn.product.* from atagvn.product where ProductID like '%IP%' limit 3";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> products = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductId(rs.getString("ProductID"));
            product.setCategoryId(rs.getString("CategoryId"));
            product.setProductName(rs.getString("ProductName"));
            product.setProductPrice(rs.getFloat("ProductPrice"));
            product.setQuantityInStock(rs.getInt("QuantityInStock"));
            product.setImage(rs.getString("Image"));
            product.setStatus(rs.getInt("Status"));
            product.setDescription(rs.getString("Description"));
            products.add(product);
        }
        return products;
    }


    public ArrayList<Product> getListProductSS() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "\n" +
                "select atagvn.product.* from atagvn.product where ProductID like '%SS%' limit 3";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> products = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductId(rs.getString("ProductID"));
            product.setCategoryId(rs.getString("CategoryId"));
            product.setProductName(rs.getString("ProductName"));
            product.setProductPrice(rs.getFloat("ProductPrice"));
            product.setQuantityInStock(rs.getInt("QuantityInStock"));
            product.setImage(rs.getString("Image"));
            product.setStatus(rs.getInt("Status"));
            product.setDescription(rs.getString("Description"));
            products.add(product);
        }
        return products;
    }


    public Product getProduct(String productId) throws SQLException {
        Connection connection = DBConnect.getConnection();

        String sql = "select * from atagvn.product where ProductID = '"+productId+"'";

        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while (rs.next()) {
            product.setProductId(rs.getString("ProductID"));
            product.setCategoryId(rs.getString("CategoryId"));
            product.setProductName(rs.getString("ProductName"));
            product.setProductPrice(rs.getFloat("ProductPrice"));
            product.setQuantityInStock(rs.getInt("QuantityInStock"));
            product.setImage(rs.getString("Image"));
            product.setStatus(rs.getInt("Status"));
            product.setDescription(rs.getString("Description"));
        }
        return product;
    }

    @Override
    public void saveProduct(Product product) throws SQLException {
        String sql = "INSERT INTO atagvn.product(ProductID,CategoryID,ProductName,ProductPrice,QuantityInStock,Image,Status,Description) VALUES (?,?,?,?,?,?,?,?)";
        Connection con = DBConnect.getConnection();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, product.getProductId());
            ps.setString(2, product.getCategoryId());
            ps.setString(3, product.getProductName());
            ps.setFloat(4, product.getProductPrice());
            ps.setInt(5, product.getQuantityInStock());
            ps.setString(6, product.getImage());
            ps.setInt(7, product.getStatus());
            ps.setString(8, product.getDescription());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "UPDATE atagvn.product SET CategoryID=?, ProductName=?, ProductPrice=?,QuantityInStock=?, Image=?,Status=?,Description = ? WHERE ProductID = ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, product.getCategoryId());
            ps.setString(2, product.getProductName());
            ps.setFloat(3, product.getProductPrice());
            ps.setInt(4, product.getQuantityInStock());
            ps.setString(5, product.getImage());
            ps.setInt(6, product.getStatus());
            ps.setString(7, product.getDescription());
            ps.setString(8, product.getProductId());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteProduct(String productId) throws SQLException {
        try {
            Connection connection = DBConnect.getConnection();
            String sql = "DELETE FROM atagvn.product WHERE ProductID = ?";
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, productId);
            int temp = ps.executeUpdate();
            return temp == 1;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Product> searchProduct(String searchName) throws SQLException {
        String sql = "select * from product where ProductName like ?";
        List<Product> productList = new ArrayList<>();
        try(Connection connection = DBConnect.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1,"%_"+searchName+"_%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String id = rs.getString("ProductID");
                String categoryId = rs.getString("CategoryID");
                String productName = rs.getString("ProductName");
                float price = rs.getFloat("ProductPrice");
                int quantity = rs.getInt("QuantityInStock");
                String idmage = rs.getString("Image");
                int status = rs.getInt("Status");
                String des = rs.getString("Description");

                productList.add(new Product(id,categoryId,productName,price,quantity,idmage,status,des));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return productList;
    }

    public static void main(String[] args) {
        Product product = new Product("IP130", "OPP", "Daikahuynh95", 987654, 1, "Dang Cap Nhat", 0, "Dang Cap Nhat");
        ProductServiceImp productServiceImp = new ProductServiceImp();
        try {


            for (Product p:productServiceImp.getListProduct("AAPL")
                 ) {
                System.out.println(p.getProductName());
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
