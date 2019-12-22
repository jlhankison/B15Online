package SlackTasks;

public class JobListingBreakdown {

    public static void main(String[] args) {

        String[] employees = {"Philipa Salthouse [Electrical Engineer] psalthouse0@g.co",
                "Ulrika Goolding [Nuclear Power Engineer] ugoolding1@moonfruit.com",
                "Hogan Matuskiewicz [VP Sales] hmatuskiewicz2@sitemeter.com",
                "Rogers Paeckmeyer [Professor] rpaeckmeyer3@unicef.org",
                "Jeanelle Semple [Software Test Engineer I] jsemple4@cafepress.com",
                "Nickie Medland [Graphic Designer] nmedland5@ed.gov",
                "Analiese Van der Brugge [Web Developer II] avanderbrugge6@yelp.com",
                "Clare Pavlitschek [Senior Quality Engineer] cpavlitschek7@chicagotribune.com",
                "Candide Dietz [Junior Executive] cdietz8@bloglines.com",
                "Lyda Boar [Automation Specialist III] lboar9@nhs.uk",
                "Worthington Thurborn [Accountant IV] wthurborna@usda.gov",
                "Sergio Dunkerk [Chemical Engineer] sdunkerkb@jalbum.net",
                "Richmound Rooze [Food Chemist] rroozec@bloglovin.com",
                "Stacia Parramore [Senior Quality Engineer] sparramored@dagondesign.com",
                "Hollie Doogue [Pharmacist] hdooguee@mediafire.com",
                "Alyosha Lettson [Desktop Support Technician] alettsonf@reference.com",
                "Laurena Orsman [Structural Analysis Engineer] lorsmang@wufoo.com",
                "Marthena Otson [Librarian] motsonh@wsj.com",
                "Nehemiah MacRitchie [VP Sales] nmacritchiei@prweb.com",
                "Guinevere Sambells [Senior Sales Associate] gsambellsj@cbc.ca",
                "Milka Demchen [Senior Developer] mdemchenk@ted.com",
                "Tracy Bartle [Geological Engineer] tbartlel@blogspot.com",
                "Netta Grzeszczak [Compensation Analyst] ngrzeszczakm@reuters.com",
                "Clayson Iapico [Cost Accountant] ciapicon@tiny.cc",
                "Ole Hinnerk [Assistant Manager] ohinnerko@merriam-webster.com",
                "Gertruda Sevier [Human Resources Assistant IV] gsevierp@usnews.com",
                "Ema Lattey [Information Systems Manager] elatteyq@123-reg.co.uk",
                "Windy Legate [Systems Administrator III] wlegater@privacy.gov.au",
                "Jolynn Baldam [Web Developer III] jbaldams@cnbc.com",
                "Bary Rivallant [Senior Financial Analyst] brivallantt@is.gd",
                "Lamond Lincoln [Environmental Tech] llincolnu@about.me",
                "Boot Coultish [Research Nurse] bcoultishv@friendfeed.com",
                "Desi Todhunter [Human Resources Manager] dtodhunterw@sakura.ne.jp",
                "Grata Tiddeman [Geological Engineer] gtiddemanx@sciencedaily.com",
                "Lisabeth MacArthur [Librarian] lmacarthury@wsj.com",
                "Orel Naisey [Engineer II] onaiseyz@purevolume.com",
                "Ashly Foskett [Civil Engineer] afoskett10@tinypic.com",
                "Bennett Ramsell [Mechanical Systems Engineer] bramsell11@paginegialle.it",
                "Skipper Abrahamsson [Financial Advisor] sabrahamsson12@networksolutions.com",
                "Sydel Mathevon [Senior Financial Analyst] smathevon13@ca.gov",
                "Garrik Fehners [Database Administrator II] gfehners14@wsj.com",
                "Bonnibelle Artharg [Senior Cost Accountant] bartharg15@nhs.uk",
                "Marline Jurgensen [Automation Specialist I] mjurgensen16@soup.io",
                "Beatrisa Padillo [Registered Nurse] bpadillo17@wix.com",
                "Fallon Ancliff [Computer Systems Analyst II] fancliff18@livejournal.com",
                "Nelle Otteridge [VP Quality Control] notteridge19@amazon.de",
                "Trent Dever [Office Assistant III] tdever1a@ebay.co.uk",
                "Shurwood Lightewood [Geological Engineer] slightewood1b@xing.com",
                "Min Plain [Speech Pathologist] mplain1c@altervista.org",
                "Rodina Spittal [Director of Sales] rspittal1d@loc.gov",
                "Cece Bosley [Web Developer I] cbosley1e@wired.com",
                "Peterus Mantram [General Manager] pmantram1f@blogspot.com",
                "Edita Chipps [Financial Advisor] echipps1g@tripod.com",
                "Marlon O'Ruane [Environmental Tech] moruane1h@phpbb.com",
                "Madella Dorn [Chemical Engineer] mdorn1i@gravatar.com",
                "Dermot Neild [Marketing Assistant] dneild1j@mysql.com",
                "Bianca Colbridge [Account Representative II] bcolbridge1k@statcounter.com",
                "Viva Crocker [Financial Advisor] vcrocker1l@skyrock.com",
                "Caressa Foltin [Civil Engineer] cfoltin1m@netvibes.com",
                "Cacilie Devlin [Teacher] cdevlin1n@clickbank.net",
                "Tadeo Mattschas [Accounting Assistant III] tmattschas1o@topsy.com",
                "Jeanne Klimontovich [Assistant Media Planner] jklimontovich1p@weather.com",
                "Sharity Gillitt [Graphic Designer] sgillitt1q@diigo.com",
                "Kermit Marciskewski [Operator] kmarciskewski1r@51.la",
                "Aubree Woodcock [Account Representative I] awoodcock1s@creativecommons.org",
                "Franz Camelin [Office Assistant III] fcamelin1t@cocolog-nifty.com",
                "Ring Pietroni [Speech Pathologist] rpietroni1u@alibaba.com",
                "Stacey Oosthout de Vree [GIS Technical Architect] soosthoutdevree1v@behance.net",
                "Eadmund St. Queintain [Legal Assistant] estqueintain1w@seesaa.net",
                "Nina Willbraham [Quality Engineer] nwillbraham1x@163.com",
                "Ozzie Victory [Actuary] ovictory1y@nationalgeographic.com",
                "Carina Vassar [Database Administrator IV] cvassar1z@blogger.com",
                "Micheil Sheers [Cost Accountant] msheers20@yolasite.com",
                "Cayla Davinet [Operator] cdavinet21@linkedin.com",
                "Gillian Whawell [Desktop Support Technician] gwhawell22@artisteer.com",
                "Berk Iskowitz [Food Chemist] biskowitz23@tumblr.com",
                "Dinnie Ehlerding [Librarian] dehlerding24@naver.com",
                "Valerye A'Barrow [Senior Editor] vabarrow25@last.fm",
                "Allayne Tuison [Speech Pathologist] atuison26@guardian.co.uk",
                "Mozes Berrigan [Safety Technician II] mberrigan27@trellian.com",
                "Pammi Coleshill [Director of Sales] pcoleshill28@cdbaby.com",
                "Arden Woodwind [Sales Representative] awoodwind29@sciencedaily.com",
                "Brier Fanton [VP Marketing] bfanton2a@blogspot.com",
                "Meredithe Lembke [Chemical Engineer] mlembke2b@whitehouse.gov",
                "Lamar Pauly [Chemical Engineer] lpauly2c@army.mil",
                "Timothea Hazlegrove [Recruiting Manager] thazlegrove2d@biblegateway.com",
                "Horatio Domek [Graphic Designer] hdomek2e@wix.com",
                "Ronnie Mariette [Speech Pathologist] rmariette2f@weibo.com",
                "Rouvin Grindley [Cost Accountant] rgrindley2g@g.co",
                "Benjie Gowman [Junior Executive] bgowman2h@constantcontact.com",
                "Kalindi Uttley [Editor] kuttley2i@mayoclinic.com",
                "Clive Atter [Business Systems Development Analyst] catter2j@networkadvertising.org",
                "Drusilla Goulbourne [Registered Nurse] dgoulbourne2k@list-manage.com",
                "Shayne Gooddie [Web Developer III] sgooddie2l@woothemes.com",
                "Mendel Wallington [Web Designer I] mwallington2m@list-manage.com",
                "Rey Cosbee [Administrative Assistant III] rcosbee2n@mapy.cz",
                "Hunfredo Davitti [Design Engineer] hdavitti2o@stumbleupon.com",
                "Jenda Grundell [Programmer Analyst III] jgrundell2p@npr.org",
                "Nicko Wozencroft [Paralegal] nwozencroft2q@imdb.com",
                "Tomkin Norvill [Systems Administrator III] tnorvill2r@npr.org"};

        String[] jobTitles = new String[employees.length];
        String[] emails = new String[employees.length];
        String[][] firstNameLastName = new String[2][employees.length];
        int i = 0;

        for (int j = 0; j < firstNameLastName[i].length; j++) {
            jobTitles[j] = employees[j].substring(employees[j].indexOf("[") + 1 , employees[j].indexOf("]"));
            emails[j] = employees[j].substring(employees[j].lastIndexOf(" "));
            for (; i < firstNameLastName.length; i++) {
                if (i == 0){
                    firstNameLastName[i][j] = employees[j].substring(0 , employees[j].indexOf(" "));
                }else{
                    firstNameLastName[i][j] = employees[j].substring(employees[j].indexOf(" ") + 1 , employees[j].indexOf(" ["));
                }
                System.out.print(firstNameLastName[i][j].charAt(0));
            }
            System.out.print(" --> " + jobTitles[j] + ", Contact email: " + emails[j]);
            i = 0;


        }


    }
}
