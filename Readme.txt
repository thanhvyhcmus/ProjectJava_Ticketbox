-t tạo project maven trong netbeans, nên nếu muốn add thêm libraries thì phải sửa trong Project Files file pom.xml thêm
<dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.22</version>
        </dependency>
    </dependencies>
sau </poperties> 
-thêm dòng này nó tự tải jdbc connector j về

*Sau khi có lib rồi Muốn kết nối đc với mysql:
_ tải mysql server và workbench về rồi vào mysql workbench thực hiện mấy dòng lệnh trong file database.sql t gửi để tạo data
_trong class JDBCConnection thuoc class DAO mn sửa lại username và pass giống cái mn cài trong mysql á
_Vậy là chạy đc rồi test lại bằng việc gọi hàm getJDBCCOnnection nếu có xuất hiện thông báo conneted successfully thì OK
