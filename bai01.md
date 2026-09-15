# Bài 1: Tìm Bug

### I. Đề bài
#### Ví dụ: Ta khởi tạo mảng với `leader[i] = i`.

```java
public void onion(int p, int q) {
    for (int i, i < leader.length)
        if (leader[i] == leader[p])
            leader[i] == leader[q]
}
```

1. *Dữ kiện:*
   - Một số nguyên $0 <= i, j < n$, sao cho $i$ và $j$ đều thuộc một tập hợp, nhưng `find(i) != find(j)`.

2. *Yêu cầu:*
   - Tìm một testcase để cài đặt trên sai.

---

### II. Chứng minh cho bài toán <br>
#### **Cho một mảng** `leader=[0,1,2]` : tương ứng với `leader[n] = n` . <br>
##### **Bước 1** : Gọi hàm onion(0,1) <br>
Thấy `leader[0] == leader[0]` => `leader[0] = leader[1] = 1` <=> mảng `leader = [1,1,2]` . <br>
##### **Bước 2** : Tiếp tục gọi hàm onion(0,2) <br>
Thấy `leader[0] == leader[0]` => `leader[0] = leader[2] = 2` **<Bug ở đây>** <=> mảng `leader = [2,1,2]` . ***đây là mảng sai vì nó chưa cập nhật luôn ở vị trí*** `leader[1]` <br><br>
>***VẬY TESTCASE SAI CHO BÀI NÀY LÀ [0,1,2] VỚI 2 BƯỚC NHƯ TRÊN*** 





