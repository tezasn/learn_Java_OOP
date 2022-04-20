package projek.teza.data;

 class SocialMedia {
    String name;
}

 class Facebook extends SocialMedia{
final void login(String username, String password){

}
}

/**
 * Error karena sudah final untuk class facebook
 */
class FakeFacebook extends Facebook{
    /**
     * method error karena method parent sudah final
     */
//    void login(String username, String password){}
}


