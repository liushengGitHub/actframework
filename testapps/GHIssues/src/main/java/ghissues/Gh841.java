package ghissues;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.util.C;

import java.util.Map;

@UrlContext("841")
public class Gh841 extends BaseController {

    @GetAction
    public Map<String, String> test(boolean fail) {
        Controller.Util.unauthorizedIf(fail);
        return C.Map("token", "aaa");
    }

}
