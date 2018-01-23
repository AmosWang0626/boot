package cn.amos.common.request;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class PageModel<S> {
    private Integer page;
    private Integer rows;
    private String[] sort;
    private String[] order;
    private S search;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public S getSearch() {
        return search;
    }

    public void setSearch(S search) {
        this.search = search;
    }

    public String[] getSort() {
        return sort;
    }

    public void setSort(String[] sort) {
        this.sort = sort;
    }

    public String[] getOrder() {
        return order;
    }

    public void setOrder(String[] order) {
        this.order = order;
    }

    public Integer getLastIndex() {
        return page * rows;
    }

    public Integer getFirstIndex() {
        return (page - 1) * rows;
    }
}
