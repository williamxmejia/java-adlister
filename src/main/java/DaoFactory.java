public class DaoFactory {
    private static Ads adsDao;
    private static Products productsDao;

    public static Products getProductsDao() {
        if(productsDao == null){
            productsDao = new ListProductsDAO();
        }
        return productsDao;
    }

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
}
