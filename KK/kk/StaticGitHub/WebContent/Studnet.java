public Class Studnet{
  private int id;
  private String name;
  private String arrdess;
  
  public Student(int id,String name,String arrdess){
    this.id = id;
    this.name = name;
    this.arrdess = arrdess;
  }
  
  public Student(){
    
  }
  
  public void setId(Integer id){
    this.id = id;
  }
  
  public Integer getId(){
    return this.id;
  }
}
