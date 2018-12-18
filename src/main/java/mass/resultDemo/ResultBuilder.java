package mass.resultDemo;

public interface ResultBuilder<T> {
    ResultVo status(int code);
    //Result header();
    /*List<Result> error();
    Result ok();
    Result body();*/
    ResultVo body(T data);

}
