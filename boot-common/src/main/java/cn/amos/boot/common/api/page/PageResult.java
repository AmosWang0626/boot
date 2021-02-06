package cn.amos.boot.common.api.page;

import java.io.Serializable;
import java.util.List;

/**
 * boot
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class PageResult<E> implements Serializable {
    private static final long serialVersionUID = 5248311773546420443L;

    /**
     * 当前是第几页
     */
    private int page;
    /**
     * 每页记录数
     */
    private int size;
    /**
     * 当前页记录数
     */
    private int number;
    /**
     * 总页数
     */
    private int totalPages;
    /**
     * 总记录数
     */
    private int total;
    /**
     * 是否第一页
     */
    private boolean first;
    /**
     * 是否最后一页
     */
    private boolean last;
    /**
     * 对象列表
     */
    private List<E> rows;

    /**
     * 最终执行,设置最终参数
     *
     * @param page 当前页码
     * @param size 每页多少数据
     */
    public void finish(int page, int size) {
        setPage(page);
        setSize(size);
        setTotalPages();
        setFirst();
        setLast();
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages() {
        int basePage = total / size;
        int surplus = total % size;
        this.totalPages = (surplus > 0 ? basePage + 1 : basePage);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst() {
        this.first = (page == 1);
    }

    public boolean isLast() {
        return last;
    }

    public void setLast() {
        this.last = (page == getTotalPages());
    }

    public List<E> getRows() {
        return rows;
    }

    public void setRows(List<E> rows) {
        this.rows = rows;
    }
}
