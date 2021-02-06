package cn.amos.boot.common.api.page;

/**
 * boot
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class PageModel<S> extends Page {

    private S search;

    private String[] sort;
    private String[] order;

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

}
