<%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/21/2020
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Furama resort</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Vanilla Bootstrap v4.2.1 Theme</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/fontAwesome.css">
    <link rel="stylesheet" href="css/hero-slider.css">
    <link rel="stylesheet" href="css/templatemo-main.css">
    <link rel="stylesheet" href="css/owl-carousel.css">

    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">

    <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>

  </head>
  <body>
  <div class="fixed-side-navbar">
    <ul class="nav flex-column">
      <li class="nav-item"><a class="nav-link" href="#home"><span>Intro</span></a></li>
      <li class="nav-item"><a class="nav-link" href="#services"><span>Services</span></a></li>
      <li class="nav-item"><a class="nav-link" href="#portfolio"><span>Portfolio</span></a></li>
      <li class="nav-item"><a class="nav-link" href="#our-story"><span>Our Story</span></a></li>
      <li class="nav-item"><a class="nav-link" href="#contact-us"><span>Contact Us</span></a></li>
    </ul>
  </div>

  <div class="parallax-content baner-content" id="home">
    <div class="container">
      <div class="first-content">
        <h1>Furama Resort</h1>
        <span><em>luxurious</em> level </span>
        <div class="primary-button">
          <a href="#services">Discover More</a>
        </div>
      </div>
    </div>
  </div>


  <div class="service-content" id="services">
    <div class="container">
      <div class="row">
        <div class="col-md-4">
          <div class="left-text">
            <h4>More About Furama Resort</h4>
            <div class="line-dec"></div>
            <p>Traditional Vietnamese design style and French colonial architecture, making Furama the most prestigious resort in Vietnam
              - honored to welcome many celebrities, royalty, politicians, electric stars Photos and international business leaders.</p>
            <ul>
              <li>- Overlooking Da Nang beach stretching white sand</li>
              <li>-  The resort has 196 rooms designed in traditional Vietnamese style combined with French style</li>
              <li>-  The resort’s culinary experience features a mixture of the authentic and locally inspired Vietnamese, Asian, Italian and other European cuisines plus the best imported steaks.</li>
            </ul>
            <div class="primary-button">
              <a href="#portfolio">Learn More About Us</a>
            </div>
          </div>
        </div>
        <div class="col-md-8">
          <div class="row">
            <div class="col-md-6">
              <div class="service-item">
                <h4>Customer</h4>
                <div class="line-dec"></div>
                <a  href="${pageContext.request.contextPath}/customers">Click to go Customers page</a>
              </div>
            </div>
            <div class="col-md-6">
              <div class="service-item">
                <h4>Employee</h4>
                <div class="line-dec"></div>
                <a class="nav-link" href="${pageContext.request.contextPath}/employees">Click to go Employees page</a>
              </div>
            </div>
            <div class="col-md-6">
              <div class="service-item">
                <h4>Services</h4>
                <div class="line-dec"></div>
                <a class="nav-link" href="/services">Click to go Services page</a>
              </div>
            </div>
            <div class="col-md-6">
              <div class="service-item">
                <h4>Contract</h4>
                <div class="line-dec"></div>
                <a class="nav-link" href="/contracts">Click to go Contracts page</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>


  <div class="parallax-content projects-content" id="portfolio">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div id="owl-testimonials" class="owl-carousel owl-theme">
            <div class="item">
              <div class="testimonials-item">
                <a href="img/1st-big-item.jpg" data-lightbox="image-1"><img src="img/1st-item.jpg" alt=""></a>
                <div class="text-content">
                  <h4><a  href="${pageContext.request.contextPath}/customers">Customer</a></h4>
                  <span>CLICK HERE</span>
                </div>
              </div>
            </div>
            <div class="item">
              <div class="testimonials-item">
                <a href="img/2nd-big-item.jpg" data-lightbox="image-1"><img src="img/2nd-item.jpg" alt=""></a>
                <div class="text-content">
                  <h4><a  href="${pageContext.request.contextPath}/services">Service</a></h4>
                  <span>CLICK HERE</span>
                </div>
              </div>
            </div>
            <div class="item">
              <div class="testimonials-item">
                <a href="img/3rd-big-item.jpg" data-lightbox="image-1"><img src="img/3rd-item.jpg" alt=""></a>
                <div class="text-content">
                  <h4><a class="nav-link" href="${pageContext.request.contextPath}/employees">Employee</a></h4>
                  <span>CLICK HERE</span>
                </div>
              </div>
            </div>
            <div class="item">
              <div class="testimonials-item">
                <a href="img/4th-big-item.jpg" data-lightbox="image-1"><img src="img/4th-item.jpg" alt=""></a>
                <div class="text-content">
                  <h4><a class="nav-link" href="${pageContext.request.contextPath}/contracts">Contract</a></h4>
                  <span>CLICK HERE</span>
                </div>
              </div>
            </div>
            <div class="item">
              <div class="testimonials-item">
                <a href="img/5th-big-item.jpg" data-lightbox="image-1"><img src="img/5th-item.jpg" alt=""></a>
                <div class="text-content">
                  <h4><a class="nav-link" href="${pageContext.request.contextPath}/contract-details">Contract Detail</a></h4>
                  <span>CLICK HERE</span>
                </div>
              </div>
            </div>
<%--            <div class="item">--%>
<%--              <div class="testimonials-item">--%>
<%--                <a href="img/6th-big-item.jpg" data-lightbox="image-1"><img src="img/6th-item.jpg" alt=""></a>--%>
<%--                <div class="text-content">--%>
<%--                  <h4>Healthy Milkshake</h4>--%>
<%--                  <span>$77.00</span>--%>
<%--                </div>--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="item">--%>
<%--              <div class="testimonials-item">--%>
<%--                <a href="img/2nd-big-item.jpg" data-lightbox="image-1"><img src="img/2nd-item.jpg" alt=""></a>--%>
<%--                <div class="text-content">--%>
<%--                  <h4>Antique Decoration Photo</h4>--%>
<%--                  <span>$84.50</span>--%>
<%--                </div>--%>
<%--              </div>--%>
<%--            </div>--%>
<%--            <div class="item">--%>
<%--              <div class="testimonials-item">--%>
<%--                <a href="img/1st-big-item.jpg" data-lightbox="image-1"><img src="img/1st-item.jpg" alt=""></a>--%>
<%--                <div class="text-content">--%>
<%--                  <h4>Awesome Notes Book</h4>--%>
<%--                  <span>$96.75</span>--%>
<%--                </div>--%>
<%--              </div>--%>
<%--            </div>--%>
          </div>
        </div>
      </div>
    </div>
  </div>


  <div class="tabs-content" id="our-story">
    <div class="container">
      <div class="row">
        <div class="col-md-8 mx-auto">
          <div class="wrapper">
            <section id="first-tab-group" class="tabgroup">
              <div id="tab1">
                <img src="img/1st-tab.jpg" alt="">
                <p>FURAMA RESORT DA NANG</p>
              </div>
              <div id="tab2">
                <img src="img/2nd-tab.jpg" alt="">
                <p>FURAMA RESORT DA NANG</p>
              </div>
              <div id="tab3">
                <img src="img/3rd-tab.jpg" alt="">
                <p>FURAMA RESORT DA NANG</p>
              </div>
              <div id="tab4">
                <img src="img/4th-tab.jpg" alt="">
                <p>FURAMA RESORT DA NANG</p>
              </div>
            </section>
            <ul class="tabs clearfix" data-tabgroup="first-tab-group">
              <li><a href="#tab1" class="active">2008 - 2014</a></li>
              <li><a href="#tab2">2014 - 2016</a></li>
              <li><a href="#tab3">2016 - 2019</a></li>
              <li><a href="#tab4">2019 - Now</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>


  <div class="parallax-content contact-content" id="contact-us">
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <div class="contact-form">
            <div class="row">
              <form id="contact" action="" method="post">
                <div class="row">
                  <div class="col-md-12">
                    <fieldset>
                      <input name="name" type="text" class="form-control" id="name" placeholder="Your name..." required="">
                    </fieldset>
                  </div>
                  <div class="col-md-12">
                    <fieldset>
                      <input name="email" type="email" class="form-control" id="email" placeholder="Your email..." required="">
                    </fieldset>
                  </div>
                  <div class="col-md-12">
                    <fieldset>
                      <textarea name="message" rows="6" class="form-control" id="message" placeholder="Your message..." required=""></textarea>
                    </fieldset>
                  </div>
                  <div class="col-md-12">
                    <fieldset>
                      <button type="submit" id="form-submit" class="btn">Send Message</button>
                    </fieldset>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="map">
            <!-- How to change your own map point
                   1. Go to Google Maps
                   2. Click on your location point
                   3. Click "Share" and choose "Embed map" tab
                   4. Copy only URL and paste it within the src="" field below
            -->
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3834.5025581746627!2d108.24769741478504!3d16.039390188899336!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31420fdbc8cc38ef%3A0x9a6a3e31121225d2!2sFurama%20Resort%20Danang!5e0!3m2!1sen!2sus!4v1608712157871!5m2!1sen!2sus" frameborder="0" style="width:100%; height:100%;border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
            </div>
        </div>
      </div>
    </div>
  </div>

  <footer>
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="primary-button">
            <a href="#home">Back To Top</a>
          </div>
          <ul>
            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
            <li><a href="#"><i class="fa fa-google"></i></a></li>
            <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
          </ul>
          <p>Copyright &copy; 2019 Company Name

            - Design: <a rel="nofollow noopener" href="https://facebook.com/theanh2010"><em>The Anh</em></a></p>
        </div>
      </div>
    </div>
  </footer>



  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
  <script src="js/vendor/bootstrap.min.js"></script>
  <script src="js/plugins.js"></script>
  <script src="js/main.js"></script>
  <script>
    function openCity(cityName) {
      var i;
      var x = document.getElementsByClassName("city");
      for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
      }
      document.getElementById(cityName).style.display = "block";
    }
  </script>

  <script>
    $(document).ready(function(){
      // Add smooth scrolling to all links
      $(".fixed-side-navbar a, .primary-button a").on('click', function(event) {

        // Make sure this.hash has a value before overriding default behavior
        if (this.hash !== "") {
          // Prevent default anchor click behavior
          event.preventDefault();

          // Store hash
          var hash = this.hash;

          // Using jQuery's animate() method to add smooth page scroll
          // The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area
          $('html, body').animate({
            scrollTop: $(hash).offset().top
          }, 800, function(){

            // Add hash (#) to URL when done scrolling (default click behavior)
            window.location.hash = hash;
          });
        } // End if
      });
    });
  </script>
  </body>
</html>
