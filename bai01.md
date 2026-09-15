# Bài 1: Tìm Bug

### I. Đề bài
#### Ví dụ: Ta khởi tạo mảng `leader = [0, 1, 2, 3, 4]`, với `leader[i] = i`.

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

### II. Chứng minh cho bài toán

Cho 3 phần tử $a, b, c$ sao cho:
- `leader[a] == leader[b] == X`
- `leader[c] == Y != X`

> **Tập trung vào hai đoạn code logic chính của cài đặt trên .**

Xét `onion(b, c)`: 
Trường hợp $i = b$, khi đó giá trị trong mảng của chỉ số $b$ vô tình bị thay đổi `leader[b] = Y`. Khi đó, có thể có một phần tử $n$ nào đó có `find(b) = find(n)`.

Với trường hợp đó thì sẽ là một trường hợp sai vì $b$ đã được cập nhật nhưng vòng lặp trong cài đặt không cập nhật cho phần tử $n$.


> *Testcase* sai cho bài này là `(0,1,2)`. <br>



