

24/12/2020
ShowtimeDao: trong trường showtime có bổ sung thêm ngày chiếu date nên có nhiều thay đổi
1- addShowtimes(idfilm,idtheater,starttime,daybegin,dayend,ignore//boolean)
hàm này add vào bảng showtimes các suất chiếu có các thông tin film,theater,starttime từ ngày daybegin cho đến dayend(mới bổ sung trường date cho một suất chiếu ám chỉ ngày chiếu hai trường numberofrows và colums có để default rồi là 5,8 nên ko cần truyền vào).
Nếu ignore nghĩa là lở có ngày mà cái giờ chiếu của cái rạp đó bị sử dụng rồi thì bỏ qua, còn ignore==false ngĩa là update lại suât chiếu đó (update where starttime,idtheater,date set idfilm = ?)
2- deleteAShowtime(idshowtime)
3- getAllShowtimeBy(idtheater,idfilm,date) sử dụng trong book-ticket sau khi customer chọn film và theater và chọn ngày chiếu thì hiển thị list showtimes
4- getAllShowtimeBy(idtheater,date) sử dụng cho admin khi admin muốn xem list showtimes của một theater để chỉnh sửa
[[listshowtime của film1 một elemetn trong này phải có thêm trường tên phim nửa nha join film],[listshowtime của film 2],[]]
5- tương tự cho getAllShowtimesBy(idfilm,date) sử dụng khi customer click vào 1 film để xem detail thì mình sẽ show cho học list showtime ở các rạp
[[listshowtime của theater1 một elemetn trong này phải có thêm trường tên rạp nửa nha join theater],[listshowtime của theater 2],[]]
6- getRevenue(idfilm,idtheater,starttime,beginday,enđay) sử dụng cho admin khi muốn xem doanh thu của một rạp, một film hay một suất chiếu trong khoảng thời gian tự chon.
return 2 cái: tổng số ghế sold/tổng số ghế( 1 rạp là 5*8 ghế)
doanh thu kiếm đc: sum
idfilm or idtheater or starttime = null nghĩa là bỏ qua trường đó mình lấy tất cả
7- HashPassword (làm sau)

25/12/2020
-LGoodDatePicker : add lib vào để sử dụng calendar
