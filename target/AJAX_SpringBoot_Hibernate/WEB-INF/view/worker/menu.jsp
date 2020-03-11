<aside class="main-sidebar">
    <!-- sidebar-->
    <section class="sidebar">		
	  <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="image">
          <img src="/adminResources/image/2.jpg" class="rounded-circle" alt="User Image">
        </div>
        <div class="info">
          <p>Johen Doe</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control border-0 bg-transparent" placeholder="Search...">
          <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat bg-transparent"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
		
      <!-- sidebar menu-->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="treeview">
          <a href="<%request.getContextPath(); %>/worker/index">
            <i class="mdi mdi-view-dashboard"></i> <span>Dashboard</span>
			<!-- <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span> -->
          </a>			
          <ul class="treeview-menu">
            <!-- <li><a href="index"><i class="mdi mdi-resize-bottom-right"></i> Dashboard </a></li> -->
<!--             <li><a href="index2.html"><i class="mdi mdi-resize-bottom-right"></i>Dashboard 2</a></li>
            <li><a href="index3.html"><i class="mdi mdi-resize-bottom-right"></i>Dashboard 3</a></li> -->
          </ul>
        </li>
<!--         <li class="treeview">
          <a href="#">
            <i class="mdi mdi mdi-account-multiple"></i>
            <span>Manage Worker</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="addWorker.jsp"><i class="mdi mdi-resize-bottom-right"></i>Add Worker</a></li>
            <li><a href="viewWorker.jsp"><i class="mdi mdi-resize-bottom-right"></i>View Worker</a></li>
            <li><a href="collapsed-sidebar.html"><i class="mdi mdi-resize-bottom-right"></i>Mini Sidebar</a></li>
          </ul>
        </li>
		<li class="treeview">
          <a href="#">
            <i class="mdi mdi-dictionary"></i>
            <span>Manage Dataset</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
			<li><a href="addDataset.jsp"><i class="mdi mdi-resize-bottom-right"></i>Add Dataset</a></li>
			<li><a href="viewDataset.jsp"><i class="mdi mdi-resize-bottom-right"></i>View Dataset</a></li>
          </ul>
        </li>
 -->
		<li class="treeview">
          <a href="#">
            <i class="mdi mdi-account-check"></i>
            <span>Attendance</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
  			<!-- <li><a href="addAttendance.jsp"><i class="mdi mdi-resize-bottom-right"></i>Add Attendance</a></li> -->
			<li><a href="<%request.getContextPath(); %>/worker/viewAttendance"><i class="mdi mdi-resize-bottom-right"></i>View Attendance</a></li>
          </ul>
        </li>
		
		<li class="treeview">
          <a href="#">
            <i class="mdi mdi-book-open-variant"></i>
            <span>Report</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="<%request.getContextPath(); %>/worker/viewReports"><i class="mdi mdi-resize-bottom-right"></i>View Reports</a></li>			
          </ul>
        </li>		
		<li class="treeview">
          <a href="#">
            <i class="mdi mdi-checkbox-multiple-blank-outline"></i>
            <span>Manage Complain</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
          <%System.out.print("menu"); %>
          <li><a href="<%request.getContextPath(); %>/worker/addComplain"><i class="mdi mdi-resize-bottom-right"></i>Add Complain</a></li>
			<li><a href="<%request.getContextPath(); %>/worker/viewComplain"><i class="mdi mdi-resize-bottom-right"></i>View Complain</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="mdi mdi-file-chart"></i>
            <span>Manage Feedback</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
          				<li><a href="<%request.getContextPath(); %>/worker/loadFeedback"><i class="mdi mdi-resize-bottom-right"></i>Add Feedback</a></li>
            			<li><a href="<%request.getContextPath(); %>/worker/viewFeedback"><i class="mdi mdi-resize-bottom-right"></i>View Feedback</a></li>
          </ul>
        </li>
<!--   		<li class="nav-devider"></li>
        <li class="treeview">
          <a href="#">
            <i class="mdi mdi-file-document"></i> <span>Forms</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="form-advanced.html"><i class="mdi mdi-resize-bottom-right"></i>Adv.Elements</a></li>
            <li><a href="code-editor.html"><i class="mdi mdi-resize-bottom-right"></i>Code Editor</a></li>
            <li><a href="editors.html"><i class="mdi mdi-resize-bottom-right"></i>Editors</a></li>
            <li><a href="validation.jsp"><i class="mdi mdi-resize-bottom-right"></i>Validation</a></li>
            <li><a href="form-wizard.html"><i class="mdi mdi-resize-bottom-right"></i>Wizard</a></li>
            <li><a href="form-general.html"><i class="mdi mdi-resize-bottom-right"></i>General Elements</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="mdi mdi-table"></i> <span>Tables</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="simple.html"><i class="mdi mdi-resize-bottom-right"></i>Simple tables</a></li>
            <li><a href="datatable.jsp"><i class="mdi mdi-resize-bottom-right"></i>Data tables</a></li>
            <li><a href="table-color.html"><i class="mdi mdi-resize-bottom-right"></i>Table Color</a></li>
          </ul>
        </li>		
		<li class="nav-devider"></li>
        <li class="treeview">
          <a href="#">
            <i class="mdi mdi-google-maps"></i> <span>Map</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="map-google.html"><i class="mdi mdi-resize-bottom-right"></i>Google Map</a></li>
            <li><a href="map-vector.html"><i class="mdi mdi-resize-bottom-right"></i>Vector Map</a></li>
          </ul>
        </li>
		<li class="treeview">
          <a href="#">
            <i class="mdi mdi-power-plug"></i> <span>Extension</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="fullscreen.html"><i class="mdi mdi-resize-bottom-right"></i>Fullscreen</a></li>
          </ul>
        </li>        
		<li class="treeview">
          <a href="#">
            <i class="mdi mdi-format-page-break"></i> <span>Sample Pages</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="blank.html"><i class="mdi mdi-resize-bottom-right"></i>Blank</a></li>
            <li><a href="coming-soon.html"><i class="mdi mdi-resize-bottom-right"></i>Coming Soon</a></li>
			<li><a href="faq.html"><i class="mdi mdi-resize-bottom-right"></i>FAQ</a></li>
			<li><a href="gallery.html"><i class="mdi mdi-resize-bottom-right"></i>Gallery</a></li>
			<li><a href="invoice.html"><i class="mdi mdi-resize-bottom-right"></i>Invoice</a></li>
			<li><a href="lightbox.html"><i class="mdi mdi-resize-bottom-right"></i>Lightbox Popup</a></li>
			<li><a href="pace.html"><i class="mdi mdi-resize-bottom-right"></i>Pace</a></li>
            <li class="treeview">
              <a href="#"><i class="mdi mdi-resize-bottom-right"></i>Authentication 
                <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
              </a>
              <ul class="treeview-menu">
                <li><a href="login.jsp"><i class="mdi mdi-resize-bottom-right"></i>Login</a></li>
                <li><a href="register.jsp"><i class="mdi mdi-resize-bottom-right"></i>Register</a></li>
                <li><a href="lockscreen.html"><i class="mdi mdi-resize-bottom-right"></i>Lockscreen</a></li>
                <li><a href="user-pass.html"><i class="mdi mdi-resize-bottom-right"></i>Recover password</a></li>				  
              </ul>
            </li>            
			<li class="treeview">
              <a href="#"><i class="mdi mdi-resize-bottom-right"></i>Error Pages 
                <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
              </a>
              <ul class="treeview-menu">
                <li><a href="404.html"><i class="mdi mdi-resize-bottom-right"></i>404</a></li>
                <li><a href="500.html"><i class="mdi mdi-resize-bottom-right"></i>500</a></li>
                <li><a href="maintenance.html"><i class="mdi mdi-resize-bottom-right"></i>Maintenance</a></li>		  
              </ul>
            </li> 
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="mdi mdi-menu"></i> <span>Multilevel</span>
            <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#"><i class="mdi mdi-resize-bottom-right"></i>Level One</a></li>
            <li class="treeview">
              <a href="#"><i class="mdi mdi-resize-bottom-right"></i>Level One
                <span class="pull-right-container">
              <i class="ti-plus pull-right"></i>
            </span>
              </a>
              <ul class="treeview-menu">
                <li><a href="#"><i class="mdi mdi-resize-bottom-right"></i>Level Two</a></li>
                <li class="treeview">
                  <a href="#"><i class="mdi mdi-resize-bottom-right"></i>Level Two
                    <span class="pull-right-container">
					  <i class="ti-plus pull-right"></i>
					</span>
                  </a>
                  <ul class="treeview-menu">
                    <li><a href="#"><i class="mdi mdi-resize-bottom-right"></i>Level Three</a></li>
                    <li><a href="#"><i class="mdi mdi-resize-bottom-right"></i>Level Three</a></li>
                  </ul>
                </li>
              </ul>
            </li>
            <li><a href="#"><i class="mdi mdi-resize-bottom-right"></i>Level One</a></li>
          </ul>
        </li>        
 -->        
      </ul>
    </section>
  </aside>