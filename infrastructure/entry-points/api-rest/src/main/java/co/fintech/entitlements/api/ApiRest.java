package co.fintech.entitlements.api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API Rest controller.
 * 
 * Example of how to declare and use a use case:
 * <pre>
 * private final MyUseCase useCase;
 * 
 * public String commandName() {
 *     return useCase.execute();
 * }
 * </pre>
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiRest {

    //public ApiRest(MyUseCase useCase){
    //    this.useCase = useCase;
    //}

    @GetMapping(path = "/usecase/path")
    public String commandName() {
        return "Value from use case v1";
    }

}
