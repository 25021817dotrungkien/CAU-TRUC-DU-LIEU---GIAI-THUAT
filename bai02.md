# bài 2 . <br>
Khởi tạo một cấu trúc dữ liệu union-find với `n`phần tử. <br>
Sau đó ta thực hiện chuỗi các thao tác `union(0,1), union(0,2), union(0,3), union(0,4).... union(0,n-1)`. <br><br>
### I. Phân tích.

### II. Trả lời câu hỏi sau : <br>
#### a. cấu trúc dữ liệu thu được chứa tổng cộng bao nhiêu thành phần liên thông liên thông ( tức là các tập hợp rời nhau ).
Hàm `union()` là một hàm sẽ gộp, liên kết 2 phần tử thành một tập hợp có cùng giá trị . <br>
Vậy khi thực hiện n thao tác hàm `union()` thì n phần tử sẽ được gộp lại với nhau thành một tập hợp duy nhất. <br>
Nên ta có số thành phần liên thông trong cơ sở dữ liệu tạo được khi thực hiện `n` bước là `1 (phần tử liên thông)` <br>
#### b. Giả sử cấu trúc dữ liệu đã cài đặt theo phương pháp quick-find .
Quick-find là cài đặt đơn giản nhất của cấu trúc dữ liệu Union-find. Với nguyên tắc ***"Find nhanh O(1) nhưng Union chậm O(n)"*** . <br>
Mỗi phần tử trực tiếp lưu id của thành phần liên thông mà nó thuộc về . <br>
`id[i] == i với mọi i = [0,n-1]` <br> <br>
*? có bao nhiêu lần cập nhật mảng được thực hiện .* <br>
Các thao tác . <br>
**find - Nhanh** . <br>
```java 
public int find(int p) {
    return id[p] ;
}
```
**Union - Chậm** .
```java
public void union(int p, int q){
    int pid = id[p];
    int qid = id[q];
    if (pid == qid) return ;
    for (int i, i < n, i++){
        if (id[i] == pid){
            id[i] = qid;
        }
    }
}
```
1. Lấy một giá trị id tại 2 điêm.
2. Thực hiện check xem có phải là 2 phần tử cùng tập hợp hay không nếu có thì dừng.
3. Kiểm soát mảng phần tử thay đổi cập nhật luôn đồng thời các phần tử có cùng id. <br>

#### Có Bao nhiêu lần cập nhật bảng .
Phân tích : thực hiện thao tác với `union(0,1), union(0,2)...union(0,n)`. <br>
**`union(0,1)`** : `id[0] == pid = 0 => id[0] = qid ;`, các thao tác đằng sau không làm thay đổi cấu trúc dữ liệu -> `id = [1,1,2,3...]` . ***Thực hiện một thao tác*** <br>
**`union(0,2)`** : `id[0] == pid => id[0] = qid`, và thao tác phía sau làm các phần tử có `id[] = pid`  -> `id = [2,2,2,3...]`.
***Thực hiện 2 thao tác*** <br>
**`union(0,3)`** : `id = [3,3,3,3,4.....]` . ***Thực hiện 3 thao tác***. <br>
Từ 3 bước trên thì ta có quy luật tổng số bước cập nhật phần tử mảng là : $1 + 2 + 3 + \dots + (n-1) \approx \frac{n^2}{2}$.<br>
> Vậy kết quả của tổng số lần cập nhật mảng $\approx \frac{n^2}{2}$.




