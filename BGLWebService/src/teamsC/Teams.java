//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package teamsC;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "Teams", targetNamespace = "http://team.ch01/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Teams {


    /**
     * 
     * @param arg0
     * @return
     *     returns teamsC.Team
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTeam", targetNamespace = "http://team.ch01/", className = "teamsC.GetTeam")
    @ResponseWrapper(localName = "getTeamResponse", targetNamespace = "http://team.ch01/", className = "teamsC.GetTeamResponse")
    public Team getTeam(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<teamsC.Team>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTeams", targetNamespace = "http://team.ch01/", className = "teamsC.GetTeams")
    @ResponseWrapper(localName = "getTeamsResponse", targetNamespace = "http://team.ch01/", className = "teamsC.GetTeamsResponse")
    public List<Team> getTeams();

}
