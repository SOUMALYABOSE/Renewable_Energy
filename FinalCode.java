import java.io.*;
class FinalCode
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));

        //Welcome Message
        System.out.println("Welcome to SUDDHA SHI 1426 : Model for Forecasting Energy transition between Renwable and Non-Renewable Energy sources for efficient Electricity Generation");
        System.out.println("******** SUDDHA SHI 1426 PROGRAM CODE MODEL IS DEVOLOPED BY ********");
        System.out.println("****** 1. SOUMALYA BOSE ******");
        System.out.println("****** 2. RWITOBAN GHOSH ******");
        System.out.println("****** 3. SOURAV GOSWAMI ******");
 
        //Main Input Section
        System.out.println("Main Input Section");

        String C,Mn;
        int S,UT,I,Nd,WS,NS,HS,SS,TS,GS,BS,fest;
        double NP,Ww=0.0,Wn=0.0,Wh=0.0,Ws=0.0,Wt=0.0,Wg=0.0,Wb=0.0;
        System.out.println("Enter Name of Country you want to forecast energy");
        C = br.readLine();
        System.out.println("Enter number of States the Country has");
        S = Integer.parseInt(br.readLine());
        System.out.println("Enter number of Union Territories the Country has");
        UT = Integer.parseInt(br.readLine());
        System.out.println("Enter number of Islands the Country has");

        I = Integer.parseInt(br.readLine());
        String Sm[]=new String[S];
        String Utm[]=new String[UT];
        String Im[]=new String[I];

        int i;

        if (S != 0)
        {
            System.out.println("Enter name of States");
            for (i=0;i<S;i++)
            {
                Sm[i] = br.readLine();
            }
        }
        if (UT != 0)
        {
            System.out.println("Enter name of Union Territories");
            for (i=0;i<UT;i++)
            {
                Utm[i] = br.readLine();
            }
        }
        if (I !=0)
        {
            System.out.println("Enter name of Islands");
            for (i=0;i<UT;i++)
            {
                Im[i] = br.readLine();
            }
        }

        //Type 1 for Yes or 2 for No to answer the following questions
        System.out.println("Type 1 for Yes or 2 for No to answer the following questions");
        System.out.println("Is there any Wind Stations in the given Country?");
        WS = Integer.parseInt(br.readLine());
        System.out.println("Is there any Nuclear Stations in the given Country?");
        NS = Integer.parseInt(br.readLine());
        System.out.println("Is there any Hydel Stations in the given Country?");
        HS = Integer.parseInt(br.readLine());
        System.out.println("Is there any Solar Staions in the given Country?");
        SS = Integer.parseInt(br.readLine());
        System.out.println("Is there any Tidal Stations in the given Country?");
        TS = Integer.parseInt(br.readLine());
        System.out.println("Is there any Geothermal Stations in the given Country?");
        GS = Integer.parseInt(br.readLine());
        System.out.println("Is there any Biogas Stations in the given Country?");
        BS = Integer.parseInt(br.readLine());

        //Enter Month details for which you want to forecast energy
        System.out.println("Enter Month details for which you want to forecast energy");

        System.out.println("Enter month name");
        Mn = br.readLine();
        System.out.println("Enter number of days the month has");
        Nd = Integer.parseInt(br.readLine());

        System.out.println("EVERY UNITS TO BE ENTERED IN Kilo FORMAT OF SI UNIT SYSTEM");

        //Enter expected average load demand of the month from past records
        System.out.println("Enter expected average load demand of the month from past records");

        double NPs[]=new double[S];
        double NPut[]=new double[UT];
        double NPi[]=new double[I];

        double ss=0,sut=0,si=0;
        if (S !=0)
        {
            System.out.println("Insert Expected demand load for the States");
            for (i =0;i<S;i++)
            {
                System.out.println("State is"+"\t"+Sm[i]);
                System.out.println("Is there any festivals or event scheduled in the given State ? Enter 1 for Yes or 2 for No");
                fest = Integer.parseInt(br.readLine());
                if(fest == 1)
                {
                    System.out.println("Please enter the expect load demand for the state taken into consideration the festivals or events");
                    NPs[i] = Double.parseDouble(br.readLine());
                }
                    else
                    {
                        System.out.println("Please enter the expect load demand for the state when there is NO festivals or events");
                        NPs[i] = Integer.parseInt(br.readLine());
                     }
                        ss = ss + NPs[i];
            }
        }

        if (UT !=0)
        {
            System.out.println("Insert Expected demand load for the Union Territory");
            for (i =0;i<UT;i++)
            {
                System.out.println("Union Territory is"+"\t"+Utm[i]);
                System.out.println("Is there any festivals or event scheduled in the given Union Territory ? Enter 1 for Yes or 2 for No");
                fest = Integer.parseInt(br.readLine());
                if(fest == 1)
                {
                    System.out.println("Please enter the expect load demand for the Union Territory taking into consideration the festivals or events");
                    NPut[i] = Integer.parseInt(br.readLine());
                }
                    else
                    {
                        System.out.println("Please enter the expect load demand for the Union Territory when there is NO festivals or events");
                        NPut[i] = Integer.parseInt(br.readLine());
                    }
                        sut = sut + NPut[i];
            }
        }

        if (I !=0)
        {
            System.out.println("Insert Expected demand load for the Island");
            for (i =0;i<I;i++)
            {
                System.out.println("Island is"+Im[i]);
                System.out.println("Is there any festivals or event scheduled in the given Island ? Enter 1 for Yes or 2 for No");
                fest = Integer.parseInt(br.readLine());
                if(fest == 1)
                {
                    System.out.println("Please enter the expect load demand for the Island taking into consideration the festivals or events");
                    NPi[i] = Integer.parseInt(br.readLine());
                }
                    else
                    {
                        System.out.println("Please enter the expect load demand for the Island when there is NO festivals or events");
                        NPi[i] = Integer.parseInt(br.readLine());
                    }
                        si = si + NPi[i];
            }
        }

        NP=ss+sut+si;

        // Important Displays from the Main Input Section
        System.out.println("Important Displays from the Main Input Section");

        System.out.println("Energy to be forecasted for the month"+"\t"+Mn);
        System.out.println("Number of days in the given month"+"\t"+Nd);
        System.out.println("Expected Load Demand of the given Country for the given month is"+"\t"+NP+"KW");

        //End of Main Input Section
        System.out.println("End of Main Input Section");


        if (WS == 1)
        {
            //Wind Mill Power Station Input Section
            System.out.println("Wind Mill Power Station Input Section");

            int nw;
            System.out.println("Enter the total number of wind mill power station the given country has");
            nw= Integer.parseInt(br.readLine());

            int b[]=new int[nw];
            double pa[]=new double[nw];
            double V[]=new double[nw];
            double Ar[]=new double[nw];
            double Cp[]=new double[nw];
            double Ng[]=new double[nw];
            double Nb[]=new double[nw];
            String aow[]=new String[nw];
            double WWw;
            System.out.println("Enter details of each wind mills");
            for (i =0;i<nw;i++)
            {
                System.out.println("Enter details of"+(i+1)+"th wind mill station");
                System.out.println("Enter location area");
                aow[i] = br.readLine();
                System.out.println("Enter the total number of rotors i.e. wind mills present at the place");
                b[i] = Integer.parseInt(br.readLine());
                System.out.println("Enter air density of the place");
                pa[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter average wind velocity of the place for the given month");
                V[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter average rotor swept area of the place");
                Ar[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter average coefficient of performance for the place");
                Cp[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter average generator efficiency for the place");
                Ng[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter average gear box bearing efficiency for the place");
                Nb[i] = Double.parseDouble(br.readLine());
            }

            //Calculating Wind Power from the Wind Stations for the given month and given country
            for (i=0;i<nw;i++)
            {
                WWw = 0.5*pa[i]*Ar[i]*Cp[i]*Ng[i]*Nb[i];
                Ww = Ww+(WWw*Nd);
            }

            //Display section for thw Total Predicted Wind Power of the given Country for the given month
            System.out.println("Display section for thw Total Predicted Wind Power of the given Country for the given month");

            System.out.println("Total Predicted Wind Power for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is :"+"\t"+Ww+"KW");
        }



        if (NS == 1)
        {

            //Nuclear Power Station Input Section
            System.out.println("Nuclear Power Station Input Section");

            int nn;
            System.out.println("Enter the total number of nuclear power station the given country has");
            nn= Integer.parseInt(br.readLine());

            int us[] =new int[nn];
            double Mr[] =new double[nn];
            double Mp[] =new double[nn];
            String aon[]=new String[nn];
            double WWn,En,spl;
            System.out.println("Enter details of each nuclear power station");
            for (i =0;i<nn;i++)
            {
                System.out.println("Enter details of"+(i+1)+"th nuclear power station");
                System.out.println("Is the source of Uranium is mineral ore ? If Yes enter 1, else enter 2");
                us[i] = Integer.parseInt("br.readLine()");
                if (us[i] == 2)
                {
                System.out.println("Enter location area");
                aon[i] = br.readLine();
                System.out.println("Enter Total Mass of the Reactant");
                Mr[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter Estimated Total Mass of the Product");
                Mp[i] = Double.parseDouble(br.readLine());
                }
                else
                {
                    Mr[i] =0.0;
                    Mp[i] =0.0;
                }


            }

            //Calculating Nuclear Power from the Wind Stations for the given month and given country
            for (i=0;i<nn;i++)
            {
                if (us[i] == 2)
                {
                    WWn = Mr[i]-Mp[i];
                    spl = 3*Math.pow(10,5);
                    En = WWn*Math.pow(spl,2);
                    Wn = Wn+((En/86400)*Nd);
                }

            }

            //Display section for the Total Predicted Nuclear Power of the given Country for the given month
            System.out.println("Display section for thw Total Predicted Nuclear Power of the given Country for the given month");
            System.out.println("Total Predicted Nuclear Power for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is :"+"\t"+Wn+"KW");
        }

        if (HS == 1)
        {
            //Hydel Power Station Input Section
            System.out.println("Hydel Power Station Input Section");

            int nh;
            System.out.println("Enter the total number of hydel power stations the given country has");
            nh = Integer.parseInt(br.readLine());

            double Nt[] = new double[nh];
            double pw[] = new double[nh];
            double Qw[] = new double[nh];
            double ag[] = new double[nh];
            double hw[] = new double[nh];
            String aoh[]=new String[nh];
            double WWh;
            System.out.println("Enter details of each hydel power stations");
            for (i =0;i<nh;i++)
            {
                System.out.println("Enter details of"+(i+1)+"th hydel power station");
                System.out.println("Enter location area");
                aoh[i] = br.readLine();
                System.out.println("Enter efficiency of the turbine");
                Nt[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter density of water");
                pw[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter volumetric flow rate");
                Qw[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter acceleration due to gravity for the place");
                ag[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter difference of height between inlet and outlet");
                hw[i] = Double.parseDouble(br.readLine());
            }

            //Calculating Hydel Power from the Solar Power Stations for the given month and given country
            for (i=0;i<nh;i++)
            {
                WWh = Nt[i]*pw[i]*Qw[i]*ag[i]*hw[i];
                Wh = Wh+(WWh*Nd);
            }

            //Display section for the Total Predicted Hydel Power of the given Country for the given month
            System.out.println("Display section for the Total Predicted Hydel Power of the given Country for the given month");

            System.out.println("Total Predicted Hydel Power for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is :"+"\t"+Wh+"KW");


        }

        if (SS == 1)
        {
            //Solar Power Station Input Section
            System.out.println("Solar Power Station Input Section");

            int ns;
            System.out.println("Enter the total number of solar power stations the given country has");
            ns = Integer.parseInt(br.readLine());

            double a[]=new double[ns];
            double bt[]=new double[ns];
            double Sinc[]=new double[ns];
            double Ep[]=new double[ns];
            double A[]=new double[ns];
            double PR[]=new double[ns];
            String aos[]=new String[ns];
            double WWs;
            System.out.println("Enter details of each solar power stations");
            for (i =0;i<ns;i++)
            {
                System.out.println("Enter details of"+(i+1)+"th solar power station");
                System.out.println("Enter location area");
                aos[i] = br.readLine();
                System.out.println("Enter Solar elevation in degrees");
                a[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter Panel tilt angle of the module measured from the horizontal in degrees");
                bt[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter Solar power density in KW/Km^2 incident on a horizontal surface according to solar elevation angle");
                Sinc[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter Electrical power of one solar panel in KW");
                Ep[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter total solar panel area in Km^2 ");
                A[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter Performance Ratio");
                PR[i] = Double.parseDouble(br.readLine());
            }

            //Calculating Solar Power from the Solar Power Stations for the given month and given country
            for (i=0;i<ns;i++)
            {
                WWs = Math.sin(a[i]+bt[i])*A[i]*(Ep[i]/A[i])*PR[i];
                Ws = Ws+(WWs*Nd);
            }

            //Display section for the Total Predicted Solar Power of the given Country for the given month
            System.out.println("Display section for the Total Predicted Solar Power of the given Country for the given month");

            System.out.println("Total Predicted Solar Power for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is :"+"\t"+Ws+"KW");


        }

        if (TS == 1)
        {
            //Tidal Power Station Input Section
            System.out.println("Tidal Power Station Input Section");

            int nt;
            System.out.println("Enter the total number of Tidal power stations the given country has");
            nt = Integer.parseInt(br.readLine());


            double E[]=new double[nt];
            double D[]=new double[nt];
            double Vf[]=new double[nt];
            double h[]=new double[nt];
            double Ab[]=new double[nt];
            double g[]=new double[nt];
            String aot[]=new String[nt];
            double WWt;
            System.out.println("Enter details of each tidal power stations");
            for (i =0;i<nt;i++)
            {
                System.out.println("Enter details of"+(i+1)+"th tidal power station");
                System.out.println("Enter location area");
                aot[i] = br.readLine();
                System.out.println("Enter Turbine Efficiency");
                E[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter Density of water in kg/m^3");
                D[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter velocity of the flow in Km/s");
                Vf[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter vertical tidal range");
                h[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter horizontal area of barrage basin in Km^2");
                Ab[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter acceleration due to gravity of the area");
                g[i] = Double.parseDouble(br.readLine());
            }

            //Calculating Tidal Power from the Tidal Power Stations for the given month and given country
            for (i=0;i<nt;i++)
            {
                WWt = (((0.5*Ab[i]*D[i]*g[i]*h[i]*h[i])*2)/86400)*E[i];
//taking into consideration 2 high tides and 2 low tides per day
                Wt = Wt+(WWt*Nd);
            }

            //Display section for thw Total Predicted Tidal Power of the given Country for the given month
            System.out.println("Display section for the Total Predicted Tidal Power of the given Country for the given month");

            System.out.println("Total Predicted Tidal Power for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is :"+"\t"+Wt+"KW");
        }

        if (BS == 1)
        {
            //Biogas Power Station Input Section
            System.out.println("Biogas Power Station Input Section");

            int nbs;
            System.out.println("Enter the total number of Biogas power stations the given country has");
            nbs = Integer.parseInt(br.readLine());


            double Rmp[]=new double[nbs];
            double Ms[]=new double[nbs];
            double S_m[]=new double[nbs];
            double Dom[]=new double[nbs];
            double Pm[]=new double[nbs];
            double Ty[]=new double[nbs];
            double Tmo[]=new double[nbs];
            double GMP[]=new double[nbs];
            double W[]=new double[nbs];
            double Efel[]=new double[nbs];
            double Ptel[]=new double[nbs];
            double Em[]=new double[nbs];
            double Ze[]=new double[nbs];
            double Epr[]=new double[nbs];
            double Enet[]=new double[nbs];

            String aobs[]=new String[nbs];
            double WWb;
            System.out.println("Enter details of each Biogas power stations");
            for (i =0;i<nbs;i++)
            {
                System.out.println("Enter details of"+(i+1)+"th Biogas power station");
                System.out.println("Enter location area");
                aobs[i] = br.readLine();
                System.out.println("Enter substrate mass during a year in Kilotonne/year");
                Ms[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter content of dry mass in 1 Kilotonne of substrate in %");
                S_m[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter content of dry organic mass in dry mass in % ");
                Dom[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter potential for methane production in Km^3/t-Dom");
                Pm[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter biogas plant working time in a year in hours");
                Ty[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter biogas plant working time in a month in hours ");
                Tmo[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter calorific value of methane in kWh/m^3");
                W[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter electric performance in cogeneration");
                Efel[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter the energy factor which determines the use of generated energy for own needs of the biogas plant");
                Ze[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter the net electric energy in KWh/month");
                Enet[i] = Double.parseDouble(br.readLine());




            }

            //Calculating Biogas Power from the Biogas Power Stations for the given month and given country
            for (i=0;i<nbs;i++)
            {
                Rmp[i]=Ms[i]*S_m[i]*Dom[i]*Pm[i];
                GMP[i]=Rmp[i]/Ty[i];
                Ptel[i]=GMP[i]*Efel[i]*W[i];
                Em[i]=Ptel[i]*Tmo[i];
                Epr[i]= (Em[i]*Ze[i]);
                Enet[i]=Em[i]-Epr[i];
                WWb = Enet[i];
                Wb = Wb+(WWb*Nd);
            }

            //Display section for thw Total Predicted Biogas Power of the given Country for the given month
            System.out.println("Display section for the Total Predicted Biogas Power of the given Country for the given month");

            System.out.println("Total Predicted Biogas Power for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is:"+"\t"+Wb+"KW");
        }


        if (GS == 1)
        {
            //Geothermal Power Station Input Section
            System.out.println("Geothermal Power Station Input Section");

            int ng;
            System.out.println("Enter the total number of Geothermal power stations the given country has");
            ng = Integer.parseInt(br.readLine());


            double h1[]=new double[ng];
            double h2[]=new double[ng];
            double h3[]=new double[ng];
            double h4[]=new double[ng];
            double s4[]=new double[ng];
            double s5[]=new double[ng];
            double s6[]=new double[ng];
            double s7[]=new double[ng];
            double hf[]=new double[ng];
            double hg[]=new double[ng];
            double Efg[]=new double[ng];
            double Ef1[]=new double[ng];
            double Tres[]=new double[ng];
            double Tsink[]=new double[ng];
            String aog[]=new String[ng];
            double WWg;
            System.out.println("Enter details of each Geothermal power stations");
            for (i =0;i<ng;i++)
            {
                System.out.println("Enter details of"+(i+1)+"th Geothermal power station");
                System.out.println("Enter location area");
                aog[i] = br.readLine();
                System.out.println("Enter sink temperature  of saturated geofluid in K");
                Tsink[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter reservoir temperature of saturated geofluid in K");
                Tres[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific enthalpy of saturated geofluid at state 1 in kJ/kg ");
                h1[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific enthalpy of saturated geofluid at state 2 in kJ/kg");
                h2[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific enthalpy of saturated geofluid at state 3 in kJ/kg");
                h3[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific enthalpy of saturated geofluid at state 4 in kJ/kg");
                h4[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific entropy of saturated geofluid at state 4 in kJ/kg-K");
                s4[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific entropy of saturated geofluid at state 5 in kJ/kg-K");
                s5[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific entropy of saturated geofluid at state 6 in kJ/kg-K");
                s6[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific entropy of saturated geofluid at state 7 in kJ/kg-K");
                s7[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific enthalpy of geofluid at saturated liquid state in kJ/kg");
                hf[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter specific enthalpy of geofluid at saturated vapour state 4 in kJ/kg");
                hg[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter generator efficiency");
                Efg[i] = Double.parseDouble(br.readLine());
                System.out.println("Enter isentropic turbine efficiency");
                Ef1[i] = Double.parseDouble(br.readLine());
            }
             double x2,x5;
             double h5; //specific enthalpy of saturated geofluid at state 5

            //Calculating Biogas Power from the Biogas Power Stations for the given month and given country
            for (i=0;i<ng;i++)
            {
                x2=(h2[i]-h3[i])/(h4[i]-h3[i]);
                x5=(s5[i]-s6[i])/(s7[i]-s6[i]);
                h5=hf[i]+(x5*(hg[i]-hf[i]));
                WWg = x2*(h4[i]-h5)*Efg[i];
                Wg = Wg+(WWg*Nd);
            }

            //Display section for the Total Predicted Geothermal Power of the given Country for the given month
            System.out.println("Display section for the Total Predicted Geothermal Power of the given Country for the given month");

            System.out.println("Total Predicted Geothermal Power for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is :"+"\t"+Wg+"KW");

        }

        //Main Calculations
        double W,Lp;
        W = Ww+Wn+Wh+Ws+Wt+Wg+Wb;
        Lp = ss+sut+si;

        //Main Display Section
        System.out.println("Main Display Section");
        System.out.println("Expected Electricity Demand for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is :"+"\t"+Lp+"KW");
        System.out.println("Predicted Electricity Generation from Renewable Energy Stations for the country"+"\t"+C+"\t"+"for the month"+"\t"+Mn+"\t"+"is :"+"\t"+W+"KW");
        if (Lp>W)
        {
            System.out.println("Country is FAILING to meet the load demand of public through Renewable Energy Resources");
            double nrw,pnrw;
            nrw = Lp-W;
            pnrw = (nrw/Lp)*100;
            System.out.println("Percentage of Electric Power Generated from Non-Renewable Sources is"+"\t"+pnrw);
        }
        if (Lp ==W)
        {System.out.println("Country is going NECK TO NECK in meeting the load demand of public through Renewable Energy Resources");
        }
        if (W>Lp)
            
        {
            System.out.println("Country is SUCCESSFULL in meeting the load demand of public through Renewable Energy Resources");
        }

        //End of Main Display Section
        System.out.println("End of Main Display Section");

        //Emergency Situation (During Failures)
        int e;
        System.out.println("In case of emergency or shutdown of any power station enter 1");
        e = Integer.parseInt(br.readLine());
        if (e ==1)
        {

        int adminpassw;
        System.out.println("Enter the Admin password to use the Emergency section of SUDDHA SHI 1426");
        adminpassw = Integer.parseInt(br.readLine());

        //Checking could be changed as per the real Password
        if (adminpassw == 57916341)
        {
            String prob,aoprob;
            int St,n =0;
            double roam=0.0;
            while(n ==0)
            {
                System.out.println("Enter type of station where emergency has occured");
                System.out.println("1.Wind Sation");
                System.out.println("2.Nuclear Sation");
                System.out.println("3.Hydel Sation");
                System.out.println("4.Solar Sation");
                System.out.println("5.Tidal Sation");
                System.out.println("6.Biogas Sation");
                System.out.println("7.Geothermal Sation");
                St = Integer.parseInt(br.readLine());
                System.out.println("Enter the area of Problem");
                aoprob = br.readLine();
                System.out.println("Enter the reason of shutdown");
                aoprob = br.readLine();
                double amtelec;
                System.out.println("Enter the electricity station has generated till shutdown");
                amtelec = Double.parseDouble(br.readLine());
                switch (St)
                {
                    case 1:
                    int bp;
                    double pap,Vp,Arp,Cpp,Ngp,Nbp,WWp,Wwp;

                    System.out.println("Enter the total number of rotors i.e. wind mills present at the place");
                    bp = Integer.parseInt(br.readLine());
                    System.out.println("Enter air density of the place");
                    pap = Double.parseDouble(br.readLine());
                    System.out.println("Enter average wind velocity of the place for the given month");
                    Vp = Double.parseDouble(br.readLine());
                    System.out.println("Enter average rotor swept area of the place");
                    Arp = Double.parseDouble(br.readLine());
                    System.out.println("Enter average coefficient of performance for the place");
                    Cpp = Double.parseDouble(br.readLine());
                    System.out.println("Enter average generator efficiency for the place");
                    Ngp = Double.parseDouble(br.readLine());
                    System.out.println("Enter average gear box bearing efficiency for the place");
                    Nbp = Double.parseDouble(br.readLine());
                    WWp= 0.5*pap*Arp*Cpp*Ngp*Nbp;
                    Wwp = WWp*Nd;
                    roam =amtelec-Wwp;
                    break;

                   case 2:
                   double Mrp,Mpp,WNp,splp,Enp,Wnp;

                   System.out.println("Enter Total Mass of the Reactant");
                   Mrp = Double.parseDouble(br.readLine());
                   System.out.println("Enter Estimated Total Mass of the Product");
                   Mpp = Double.parseDouble(br.readLine());
                   WNp = Mrp-Mpp;
                   splp = 3*Math.pow(10,5);
                   Enp = WNp*Math.pow(splp,2);
                   Wnp = (Enp/(Nd*86400));
                   roam = amtelec-Wnp;
                   break;

                   case 3:
                   double Ntp,pwp,Qwp,agp,hwp,WHp,Whp;

                   System.out.println("Enter efficiency of the turbine");
                   Ntp = Double.parseDouble(br.readLine());
                   System.out.println("Enter density of water");
                   pwp = Double.parseDouble(br.readLine());
                   System.out.println("Enter volumetric flow rate");
                   Qwp = Double.parseDouble(br.readLine());
                   System.out.println("Enter acceleration due to gravity for the place");
                   agp = Double.parseDouble(br.readLine());
                   System.out.println("Enter difference of height between inlet and outlet");
                   hwp= Double.parseDouble(br.readLine());
                   WHp=Ntp*pwp*Qwp*agp*hwp;
                   Whp=WHp*Nd;
                   roam=amtelec-Whp;
                   break;

                   case 4:
                   double ap,btp,Sincp,Epp,Ap,PRp,WSp,Wsp;

                   System.out.println("Enter Solar elevation in degrees");
                   ap = Double.parseDouble(br.readLine());
                   System.out.println("Enter Panel tilt angle of the module measured from the horizontal in degrees");
                   btp = Double.parseDouble(br.readLine());
                   System.out.println("Enter Solar power density in KW/Km^2 incident on a horizontal surface according to solar elevation angle");
                   Sincp = Double.parseDouble(br.readLine());
                   System.out.println("Enter Electrical power of one solar panel in KW");
                   Epp = Double.parseDouble(br.readLine());
                   System.out.println("Enter total solar panel area in Km^2 ");
                   Ap = Double.parseDouble(br.readLine());
                   System.out.println("Enter Performance Ratio");
                   PRp = Double.parseDouble(br.readLine());
                   WSp = Math.sin(ap+btp)*Ap*(Epp/Ap)*PRp;
                   Wsp =(WSp*Nd);
                   roam = amtelec-Wsp;
                   break;

                   case 5:
                   double Ep,Dp,Vfp,hp,Abp,gp,WTp,Wtp;

                   System.out.println("Enter Turbine Efficiency");
                   Ep = Double.parseDouble(br.readLine());
                   System.out.println("Enter Density of water in kg/m^3");
                   Dp = Double.parseDouble(br.readLine());
                   System.out.println("Enter velocity of the flow in Km/s");
                   Vfp = Double.parseDouble(br.readLine());
                   System.out.println("Enter vertical tidal range");
                   hp = Double.parseDouble(br.readLine());
                   System.out.println("Enter horizontal area of barrage basin in Km^2");
                   Abp = Double.parseDouble(br.readLine());
                   System.out.println("Enter acceleration due to gravity of the area");
                   gp = Double.parseDouble(br.readLine());
                   WTp = (((0.5*Abp*Dp*gp*hp*hp)*2)/86400)*Ep;
//taking into consideration 2 high tides and 2 low tides per day
                   Wtp = (WTp*Nd);
                   roam = amtelec-Wtp;
                   break;

                   case 6:
                   double
Msp,S_mp,Domp,Pmp,Typ,Tmop,Wp,Efelp,Zep,Enetp,WBp,Wbp,Eprp,Emp,Ptelp,GMPp,Rmpp;

                   System.out.println("Enter substrate mass during a year in Kilotonne/year");
                   Msp = Double.parseDouble(br.readLine());
                   System.out.println("Enter content of dry mass in 1 Kilotonne of substrate in %");
                   S_mp = Double.parseDouble(br.readLine());
                   System.out.println("Enter content of dry organic mass in dry mass in % ");
                   Domp = Double.parseDouble(br.readLine());
                   System.out.println("Enter potential for methane production in Km^3/t-Dom");
                   Pmp = Double.parseDouble(br.readLine());
                   System.out.println("Enter biogas plant working time in a year in hours");
                   Typ = Double.parseDouble(br.readLine());
                   System.out.println("Enter biogas plant working time in a month in hours ");
                   Tmop = Double.parseDouble(br.readLine());
                   System.out.println("Enter calorific value of methane in kWh/m^3");
                   Wp = Double.parseDouble(br.readLine());
                   System.out.println("Enter electric performance in cogeneration");
                   Efelp = Double.parseDouble(br.readLine());
                   System.out.println("Enter the energy factor which determines the use of generated energy for own needs of the biogas plant");
                   Zep = Double.parseDouble(br.readLine());
                   System.out.println("Enter the net electric energy in KWh/month");
                   Enetp = Double.parseDouble(br.readLine());
                   Rmpp=Msp*S_mp*Domp*Pmp;
                   GMPp=Rmpp/Typ;
                   Ptelp=GMPp*Efelp*Wp;
                   Emp=Ptelp*Tmop;
                   Eprp= (Emp*Zep);
                   Enetp=Emp-Eprp;
                   WBp = Enetp;
                   Wbp = (WBp*Nd);
                   roam = amtelec-Wbp;
                   break;

                   case 7:
                   double Tsinkp,Tresp,h1p,h2p,h3p,h4p,s4p,s5p,s6p,s7p,hfp,hgp,Efgp,Ef1p,Wgp,WGp,x2p,x5p,h5p;

                   System.out.println("Enter sink temperature  of saturated geofluid in K");
                   Tsinkp = Double.parseDouble(br.readLine());
                   System.out.println("Enter reservoir temperature of saturated geofluid in K");
                   Tresp = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific enthalpy of saturated geofluid at state 1 in kJ/kg ");
                   h1p = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific enthalpy of saturated geofluid at state 2 in kJ/kg");
                   h2p = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific enthalpy of saturated geofluid at state 3 in kJ/kg");
                   h3p = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific enthalpy of saturated geofluid at state 4 in kJ/kg");
                   h4p = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific entropy of saturated geofluid at state 4 in kJ/kg-K");
                   s4p = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific entropy of saturated geofluid at state 5 in kJ/kg-K");
                   s5p = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific entropy of saturated geofluid at state 6 in kJ/kg-K");
                   s6p = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific entropy of saturated geofluid at state 7 in kJ/kg-K");
                   s7p = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific enthalpy of geofluid at saturated liquid state in kJ/kg");
                   hfp = Double.parseDouble(br.readLine());
                   System.out.println("Enter specific enthalpy of geofluid at saturated vapour state 4 in kJ/kg");
                   hgp = Double.parseDouble(br.readLine());
                   System.out.println("Enter generator efficiency");
                   Efgp = Double.parseDouble(br.readLine());
                   System.out.println("Enter isentropic turbine efficiency");
                   Ef1p = Double.parseDouble(br.readLine());
                   x2p=(h2p-h3p)/(h4p-h3p);
                   x5p=(s5p-s6p)/(s7p-s6p);
                   h5p=hfp+(x5p*(hgp-hfp));
                   WGp = x2p*(h4p-h5p)*Efgp;
                   Wgp = (WGp*Nd);
                   roam = amtelec-Wgp;
                   break;
                   default:
                   System.out.println("Choice do not meet any of the power station mentioned in the list");
                }
                System.out.println("The mentioned Power station has failed to meet Renewable Energy demand by"+"\t"+roam+"\t"+"KW");
                System.out.println("This Electricity amount needs to be taken by the mentioned power station from the central grid by paying compensation to the GIVER COMPANY");
                System.out.println("Is there any emergency shutdown in any other power station across the given country?If No, enter 1.If Yes, enter 0");
                n = Integer.parseInt(br.readLine());
            }



        }
        else
        {
            System.out.println("XXXXXXXX ADMIN PASSWWORD DOES NOT MATCH XXXXXXXX");
        }
        System.out.println("End of Emergency Section");
    }

    //End of Emergency Section



        //End of SUDDHA SHI 1426 : Model for Forecasting Energy transition between Renewable and Non-Renewable Energy sources for efficient Electricity Generation
        System.out.println("End of SUDDHA SHI 1426 : Model for Forecasting Energy transition between Renewable and Non-Renewable Energy sources for efficient Electricity Generation");

    }
}