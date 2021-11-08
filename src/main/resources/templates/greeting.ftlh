<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Chat</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body>
<section class="vh-100">
    <div class="container py-5 h-100">
        <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
                <img src="https://mdbootstrap.com/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                     class="img-fluid" alt="Phone image">
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                <form>
                    <div class="divider d-flex align-items-center my-4">
                        <p class="text-center fw-bold  mb-0 text-muted" style="color: #3b5998;">This is my Task4
                            ^_^.Please register with GitHub or Google</p>
                    </div>

                    <a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998"
                       href="/oauth2/authorization/github" role="button">
                        <i class="fab me-2 "></i>Registration with Github!
                    </a>

                    <a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998"
                       href="/oauth2/authorization/google" role="button">
                        <i class="fab me-1 "></i>Registration with Goggle!
                    </a>

                    <div>
                        <span style="font-size:15px; color: gray">${counter}</span>
                    </div>


                </form>
            </div>
        </div>
    </div>
</section>
</body>
</html>
