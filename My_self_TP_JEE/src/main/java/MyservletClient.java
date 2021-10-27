

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyservletClient
 */
@WebServlet("/MyservletClient")
public class MyservletClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyservletClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.getServletContext().getRequestDispatcher("/indexclient.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Client client = new Client();
		
		String nomclient = request.getParameter("nomclient");
		String prenomclient = request.getParameter("prenomclient");
		String genreclient = request.getParameter("genreclient");
		String ageclient = request.getParameter("ageclient");
		String actclient = request.getParameter("actclient");
		
		
		client.setNom(nomclient);
		client.setPrenom(prenomclient);
		client.setGenre(genreclient);
		client.setAge( Integer.parseInt(ageclient));
		client.setActivite(actclient);
		
		//System.out.print(client.getNom());
		
		request.setAttribute("monsieur", client);
		this.getServletContext().getRequestDispatcher("/vueclient.jsp").forward(request, response);
		
		
	}

}
