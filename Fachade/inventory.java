class inventory{
    public boolean checkStock(String item){
        System.out.println("Verificando el stock de "+ item);
        //lo dejamos asi solo para simular que hay stock de todo
        return true;
    }
    public void reserveItem(String item){
        System.out.println("Reservando el producto: "+ item);
    }
}