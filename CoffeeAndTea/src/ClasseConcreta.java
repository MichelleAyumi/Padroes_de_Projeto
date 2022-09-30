public abstract class ClasseConcreta {
    final void templateMethod(){
        operacaoPrimitiva1();
        operacaoPrimitiva2();
        operacaoConcreta();
    }

    abstract void operacaoPrimitiva1();

    abstract void operacaoPrimitiva2();

    private void operacaoConcreta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void gancho(){
        
    }
    
}


