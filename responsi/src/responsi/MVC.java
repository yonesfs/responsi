package responsi;
class MVC {
    public void Data_P(){
        VData_P data_p = new VData_P();
        Model model = new Model();
        Controller controller = new Controller(data_p, model);
    }
    public void Gaji_P(){
        VGaji_P gaji_p = new VGaji_P();
        Model model = new Model();
        Controller controller = new Controller(gaji_p, model);
    }
    public void Data_A(){
        VData_A data_a = new VData_A();
        Model model = new Model();
        Controller controller = new Controller(data_a, model);
    }
    public void Tambah_A(){
        VTambah_A tambah_a = new VTambah_A();
        Model model = new Model();
        Controller controller = new Controller(tambah_a, model);
    }
}
