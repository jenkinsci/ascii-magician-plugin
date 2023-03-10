package io.jenkins.plugins.asciimagician;


import hudson.Launcher;
import hudson.EnvVars;
import hudson.Extension;
import hudson.FilePath;
import hudson.model.AbstractProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.Builder;
import hudson.tasks.BuildStepDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;
import java.io.IOException;
import jenkins.tasks.SimpleBuildStep;
import org.jenkinsci.Symbol;
import java.util.Random;


public class AsciiMagicianBuilder extends Builder implements SimpleBuildStep {
    private static final Random rand = new Random();

    @DataBoundConstructor
    public AsciiMagicianBuilder() {
//ascii-magician
    }

    @Override
    public void perform(Run<?, ?> run, FilePath workspace, EnvVars env, Launcher launcher, TaskListener listener) throws InterruptedException, IOException{

        int num = rand.nextInt(9) + 1;

        listener.getLogger().println("       _            _    _             ____        _ _     _ \n" +
                "      | |          | |  (_) _         |  _ \\      (_) |   | |\n" +
                "      | | ___ _ __ | | ___ _ __  ___  | |_) |_   _ _| | __| |\n" +
                "  _   | |/ _ \\ '_ \\| |/ / | '_ \\/ __| |  _ <| | | | | |/ _` |\n" +
                " | |__| |  __/ | | |   <| | | | \\__ \\ | |_) | |_| | | | (_| |\n" +
                "  \\____/ \\___|_| |_|_|\\_\\_|_| |_|___/ |____/ \\__,_|_|_|\\__,_|\n");
        switch (num) {
            case 1:
                listener.getLogger().println("                                                                                \n" +
                        "                               ./&@@@@@@@@@@@@@@@@%.                            \n" +
                        "                       .%@@@@&&&&&&&&&&&&&&&&&&&&&&&@@@                         \n" +
                        "                    &@@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@                       \n" +
                        "                  %@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@,                     \n" +
                        "                 %@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@    %@@@#            \n" +
                        "                 @@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@@@@&&&&@#           \n" +
                        "                .@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@@@&&@&/*///%@@@&@@(            \n" +
                        "                 @&&&&&&&&&&&&&&&&&&&&&&&&@@@@@@@&%@@*****/@@@@@#               \n" +
                        "                *@@&&&&&&&&&&&&&&@@@@@@&(///*/*/#@@&@&@@@@%(@@%                 \n" +
                        "             /@@@&@@@@@@@@@@@@@&&&&&&&&&@@%#/#&@(**%@(&%&@@##@@@@%              \n" +
                        "           @@&&&&&&&&&&&&&&&&&&&&@@@@@@%*..@...@*/@@&*....@.,@(/(@@@            \n" +
                        "         &@@@&&&&&&&&@@@@@@@&*........../@#,,,(*/(*@%&//////#@#////@@@          \n" +
                        "       *@@#//////@@&....#@&&,..........@/,,,   ,,,*///,,,,,,*/%@/////@@@        \n" +
                        "      @@@////*../@*.,@%&&#@&,.........#%,,  ,,,,,,,,,,,,,,,,,,/@/....,#@@,      \n" +
                        "     @@&//***,**/@#..@..,.............#%,,  ,,,,,,,,,,,,,,,,,,/%%****///@@#     \n" +
                        "   .@@#//////////%@&...................@,,, ,,,,,,,,,,,,,,,,,*/@(////////@@(    \n" +
                        "   @@&/////////////@@@@@@#.............,@*,,,,,,,,,,,,,,,,,,*/@#//////////@@,   \n" +
                        "  %@@///////////////*//@@.......,........@%,,,,,,,,,,,,,,,,/%@////////////#@@   \n" +
                        "  @@(////////...........@&.......@*........&@*,,//@(&////#@%.....,,*///////@@(  \n" +
                        " *@@/////,*,.****,******/@@/......,@/................*(@@@(******........//&@&  \n" +
                        " /@@//////////////////%@@@@@@@@(.....%@(...........(@@@@@@@@@(*/****///////#@@  \n" +
                        " /@@@@@@@@@@@@@@@@@@@@&&&&@@&&@@#&@@%*.../&@@@@@@@@@* #@@@@&@@@@@@@@@@@@@@@@@@  \n" +
                        " *@@(////////(@@@@&&&&&&&&&@@&&&&@@(   .,,*/,*@%%@@. ,@@@&@@&&@@%//////////&@&  \n" +
                        "  @@#///////@@@&&&&&&&&&&&&&@@&&&&&&@@@     ,@%###@%@@(@@@@@@&@@///////////@@/  \n" +
                        "  #@@///////(@@&&&&&&&&&&&&&&&@@@@@&&@@ &@@#@#@@%@@,   @&&@@&@@///////////%@@   \n" +
                        "   @@&///////(@@&&&&&&&&&&&&&&&&@@&&&&&@%    #@###@@  #@&&@@&@#//////////(@@.   \n" +
                        "    @@&#######%@@&&&&&&&&&&&&@@&@@&&&&&&@@,  %@####@# @@&@@&@&#####%@&###@@/    \n" +
                        "     @@@@@@@@@@@@@&&&&&&&&&&&@@&&&@@@&&&&&@@ &@####%@.@@@@&@@@@@@@@@@@@@@@(     \n" +
                        "      &@@***%(**@@&&&&&&&&&&&&@&&&&&&@@@&&&@@@@#####@@@&@@@@%@@@@@#@@@%@@.      \n" +
                        "       ,@@%*%(**#@@&&&&&&&&@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@.    ,   @@&        \n" +
                        "         #@@@(**/@@&&&&&&&&&&&@                 ./@&&&@&  @& .       .@@        \n" +
                        "           #@@@@@@@&&&&&&&&&&&@,                .,@&&&@@. .@. .**.   .&@        \n" +
                        "              @@@@@&&&&&&&&&&&@%                ..@&&&@@# .@*.........@@        \n" +
                        "                ,@@@@&&&&&&&&&&@                ..@&&&@@@@@@@@@&**/#@@%         \n" +
                        "                   *@@@@@@&&&&&@/               ..@@@@@@@@%                     \n" +
                        "                        .&@@@@@@@               ..%(.,@#                        \n" +
                        "                               ,@%               .(#..@@                        \n" +
                        "                                %@,              .*&,*&@.                       \n" +
                        "                                 @@              ..@@.                          \n" +
                        "                                  @@@@@@&##(#%%&@@@@@                           \n" +
                        "                                                                                ");
                break;
            case  2:
                listener.getLogger().println("                                                                                \n" +
                        "                                                                                \n" +
                        "                                                                                \n" +
                        "                .@@%,,/@@@      &@@@@@@@@@@@@@@@#      @@@#,,(@@#               \n" +
                        "               ,@#,,,,,,,,@@@@@,,,,,,,,,,,,,,,,,,*@@@@@#,,,,,,,,@@              \n" +
                        "                @@,,,@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,*@@@@@@,,,@@               \n" +
                        "                 ,@@@/@@/,,,,,#&&(,,,,,,,,,,,,,,,,,,(&&#@@@,@@@#                \n" +
                        "                    &@%,,@@@/      %@@&,,,,,,,,@@@#      /@@@                   \n" +
                        "                   @@,,@@             (@@,,,,@@(            .@@                 \n" +
                        "                  #@,,@@   &@@.         @@,,@@   /@@(         @@                \n" +
                        "                  @@,,@%  &  @@&        @@,,@@  @  @@@        #@                \n" +
                        "                 .@#,,@@   @@@,         @@,,@@   %@@%         @@                \n" +
                        "                 .@#,,,@@             /@@@@@@@@/             @@                 \n" +
                        "                 .@#,,,,,@@@,      (@@@@@@@@@@@@@@(      *@@@@@                 \n" +
                        "       @@@@@@%#@@@@@@,,,,,,,,*&@@%,,@@...........(@/%@@&*,,,,@@                 \n" +
                        "      @@((   ,.. ./(&@(,,,,,,,,,,,,,,@@@@@&%#@@@@@(,,,,,,,,,,@@                 \n" +
                        "     @@(/. /(  (/ ,,(&@*,,,,,,,,,,,,,,,&@  #. *@*,,,,,,,,,,,,@@                 \n" +
                        "    %@@@@&((((((((%@@@@@,,,,,@@@@@%/@@@/#@@@@@@*,,@@@@@@@@@,,@@                 \n" +
                        "  @@@@((((@@@@@@@@#(((@@@@@&@@@@((((@@#,@@@@@@@@@#*@@#(@@&@@%@@                 \n" +
                        " *@* .@@%((((((((((#@@(  @@@&%%@@(((#@@ %&@@@@@@%..@@(@@%%%%@@@@@@ ,*           \n" +
                        "  /@@   #@@@@@@@@@@@   @@@@%%%@@@@&((&@@@     .@@&@@&@@@@@@@##&@@@....@&        \n" +
                        "     ,@@@@@@%((%@@@@@@@@@@@@@@@@@@@@####@@    @@###@@@@@@@@@@@& (@*..@@#        \n" +
                        "          @@*../@@@@@@@@@@@@@@@@@@@@@&###@@  @@##&@@@@@@@@@@@&   @@@@           \n" +
                        "            ,.      @@@@@@@@@@@@@@@@@@@###@@@@##@@@@@@@@@@@@/    @@.@@          \n" +
                        "                      @@@@@@@@@@@@@@@@@@%##@@%%@@@@@@@@@@@@      @@             \n" +
                        "                        @@@@@@@@@@@@@@@@@@%%@@@@@@@@@@@@@@@@@@@@@@@/            \n" +
                        "                           @@@@@@@@@@@@@@@@@@@@@@@@@@@#                         \n" +
                        "                        %@@....#@@@@@@@@@@@@@@@@@*.....@@@                      \n" +
                        "                       ,@#@@....#@@            @@@....@@,@(                     \n" +
                        "                         @@..#@@(                ,@@&..@@                       \n" +
                        "                                                                                \n" +
                        "                                                                                ");
                break;
            case 3:
            listener.getLogger().println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&&%%%%&&&&&&&&&&&&@@@@@@@@@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&%&&&&*.              ..*%&&&&&&@@@@@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@@@@&&&&(,.,#&&*.     ..................../&&&&@@@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@&&&&#..*(#&%     ............................(&&&&@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@&&&%..,(((%(.   .................................(&&&&@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@&&#%&&&&&&,   .........  .................... ,%&&&&&&&@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@&&&&&(,..,*/&#.........,%&&&&&%.................,,..,*%&&&&@@@@@@@@\n" +
                    "@@@@@@@@@@@@&&&#.,(((((((&#........%&*...............................*&&@@@@@@@@\n" +
                    "@@@@@@@@@@@@&&#.((((((((#&/.......*#................................../&&@@@@@@@\n" +
                    "@@@@@@@@@@@&&&,(((((((((%%....................(...................,#...&&@@@@@@@\n" +
                    "@@@@@@@@@@@&&&*(((((((((&/.................   ,%,.......*%,.....   /&..%&@@@@@@@\n" +
                    "@@@@@@@@@@@@&&/%&&&&%(((&*......................%&.......(&/...,(%&&&&.#&@@@@@@@\n" +
                    "@@@@@@@@@@&&&&&(,..*&&&##&................*&&&&&&#........*&&*...*,,...#&@@@@@@@\n" +
                    "@@@@@@@@@@&&&, /&&%/.*&&%&/.................................(&&*.......#&@@@@@@@\n" +
                    "@@@@@@@@@@&&, ..##./&,*,,,..................................../&&(.....%&@@@@@@@\n" +
                    "@@@@@@@@@@&&# ..#,.................................... .........#&#.../&&@@@@@@@\n" +
                    "@@@@@@@@@@&&&(......................................#,......../%&#....&&@@@@@@@@\n" +
                    "@@@@@@@@@@@@&&&*.....,/.............................#&%%%%&&&/,...././&&@@@@@@@@\n" +
                    "@@@@@@@@@@@@@&&&&&&&&%, ....................../%(*,.........,*#&&&/./&&@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@&&&/   ...................#%...,%&&&&&&&/*&&&*...*&&@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@&&&.  ......,&,............%%*.................(&&&@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@@&&&.  .......#%,...........,#&&&&&&&&&&(.....%&&@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@@@&&%. .........#%,.........................#&&&&&@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@@@@@&&&&&&*  .........*&%...................,%&&&%#&&&&&@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@&&&&&&&%#%&&&(...........,(&&%/.........,#%&&&&&&&#((#%&&&&&@@@@@@\n" +
                    "@@@@@@@@@@@&&&&&%#(((((((#&&&(&&&&&%%&&&&&&&&&&&&&&&&&&%#&&&%##%&&##((#&&&&&@@@@\n" +
                    "@@@@@@&&&&&&&#(((((((##%%%%%%&&#,. *&%(((((((#&&&&%%%%&&%((((((#%&%%%%#((%&&&@@@\n" +
                    "@@@@&&&&&#(((((##%%%%%%%%%%%%%%%%%&&&#(#######(((#&#((%&&%#(#####&&%%%%%%&&&@@@@\n" +
                    "@@@&&&&#(((#%%%%%%%%%%%%%%%%%%%%%%%%&#(########((#&&#%&&#########&%%%%%%%&&@@@@@\n" +
                    "@@@@&&&&#((#%%%%%%%%%%%%%%%%%%%%%%%%%&(##########&&**,../&&&&&&&&&%%%%%%&&&@@@@@\n" +
                    "@@@@@&&&&###%%%%%%%%%%%%%%%%%%%%%%%%%&&######%&&#&@#*,*&/,(&(((((%@%%%%&&&@@@@@@");
                break;
            case 4:
                listener.getLogger().println("                                           ,,,,                                 \n" +
                        "                                 /@&%%%%%&&##&&%%%@.                            \n" +
                        "                              #&%%%%%%%&***%@**#%%%&,                           \n" +
                        "                            /&%%%%%%%%%&*/@/@/*(%%%%@                           \n" +
                        "                           @%%%%%%%%%%%&@@&@@@@@&@@@@&.                         \n" +
                        "       %@%(///(@&.        @%%%%%%%%&%%@@&@@@@@&@@@&%%%%&                        \n" +
                        "   %%. ********** /@   #@%%%%%%%%%%@@@@@,.....%*..(@@%&,                        \n" +
                        " %/ ***,.  .******* &%&%%%%%%%@@@@,@,............#..@                           \n" +
                        "  *//*,.    &( ***** %&%%%%%&@(@....... /(..#/..,,@*&                           \n" +
                        "             ,( *******@/.%(.&##@.....(@@%....@(....(.                          \n" +
                        "             *(.******@&*.*.&.@%&...............,@..(                           \n" +
                        "   @@#.     (# ******/&((@................/,../@/.,.@      ,&(#.                \n" +
                        "  ,# *,     .******.    ./&@@@@........*&%##%&/@@(.@*,   ,/#(@.@...@            \n" +
                        "    @* ********, *@,      #@%/.@........&@&%%&@,..@((((((%&@@@*%.@  .*#@@,      \n" +
                        "       *@@@%&@@(                @,..,(.........,@(((((((((((((((((@(*****, *@   \n" +
                        "                           .@@@%&%/%@(....,**,@@@* .*%@@%#(((((((@***&/  ##* #. \n" +
                        "                         @(*****@%@(//////&..,#@#&%@(@@#*  ,*/&@@@***&    @* /, \n" +
                        "                     #%&(********#&%@(/@##@@*@%/%%%%@/*(## /&@%*  .****((*, #/  \n" +
                        "                  .%(@//&%/*******(&%%%%@********@@/&@(&((@% ..../**&@@@@&*     \n" +
                        "                  #@//////#&/**@((&@&//@@&%%%%%%%@@&@@@///@@.....%              \n" +
                        "                 %...@(/////@&  @#@%%&@&%%%%%%%%%%%%&%@//@.......@              \n" +
                        "                 *#...../@@@      @%%%%@%&&&&%%%%%%%@%@@........@               \n" +
                        "                   @.........@     &%%%@%%%%%%%%%%%%@%(.&#.....@                \n" +
                        "                    ,&. ......@  (%.@%%%%%%%%%%%%%%%%@                          \n" +
                        "                       @*......*...*@&%%%%%%%%%%%%%%&.                          \n" +
                        "                          @*..........@%%%%%%%%%%%%%@                           \n" +
                        "                            @......##%&%%%%%%%%%%%%%@                           \n" +
                        "                             %/..,&*@%%%%%%%@%%%%%%%@                           \n" +
                        "                                .%%%%%%%%%%%@%@%%%%%%%                          \n" +
                        "                                 &%%%%%%%%%&@%%%%%%%%@                          \n" +
                        "                                @%%%%%%%%%%@&%%%%%%%%&,                         \n" +
                        "                               (%%%%%%%%%%@ &%%%%%%%%%@                         \n" +
                        "                               @%%%%%%%%%%# &%%%%%%%%%@                         \n" +
                        "                              .@%%%%%%%%%@  %%%%%%%%%%@.                        \n" +
                        "                              @%%%%%%%%%%@  ,&%%%%%%%%%%@                       \n" +
                        "                             %%@@@@&%%%%%@. @%&%%%%%%&@@@@&%*                   \n" +
                        "                            @########%@%%%@#%%%@@%############%                 \n" +
                        "                           @############%%& @%%%%%%%%#########@                 \n" +
                        "                          /&&%%&%&&%%%%@@%& @%&@&%%%%%%&&%%&&%@                 ");
                break;
            case 5:
                listener.getLogger().println("Toggle VGA font (BlockZone/IBM VGA font, full-screen)                                                                                 \n" +
                        "                          ,(&@@@@#,                                             \n" +
                        "                    /&&&&&,         (&&&                                        \n" +
                        "                (&/.(&/  ...............&&/                                     \n" +
                        "              ,&.##%.  .................  %&.                   %*,..,,,&       \n" +
                        "            *&&.*((&,....%@, ..............%&                  (/(.../,,&&      \n" +
                        "            &,(((((&....*....................@                 ,(....,(,,(      \n" +
                        "           *&(((((((.........  &.....(... .#.&                 @#....,,,,&      \n" +
                        "           .&&&%&&(%.........&@@&,...,&..&&*.&                ,&,....,,,,&(     \n" +
                        "           &.#(@%*&&.................../&....&                *#,....,,,,,,%    \n" +
                        "           &,.#.................... .....@...&                  %....,,,&       \n" +
                        "            &&...*................#@&@&/..*.&                 (&,.(   ., #      \n" +
                        "              ,&&. ......... ././&&&&&(&@..%/                 *&,.*      &      \n" +
                        "                && ....#.......*&&&###%...&*               @@@%&,..*(%&&(       \n" +
                        "                 %@ .....&,.............&&&.              @&&&&&,....,(,        \n" +
                        "             ,@&&(%&% ......&&,....,%&&&&((%&@          %@&&&&&&,....,#@@*      \n" +
                        "         .&&%((((#&&&&#  &####@&&, #&%#&&@&&((&&&     ,@&&&&&,,....,,,,,,%      \n" +
                        "       #&(((&&&&&&&&&&&&&&%&&&&%&&&@@&&&&@&&&&&&&@@@ @@&&&,,.......,,,,,,,,*&   \n" +
                        "        &&((&&&&&&&&&&&&&&&&&&&&&/. .,& ,&&&&&&&&&&&@&&&&&,,.......,,,,,,,,,&   \n" +
                        "         &&(%&&&&&&&&&&&&&&&&&   .&   (  &&&&&&&&&&&@&&&&&&&@#.,/((((/*,.       \n" +
                        "          &#(&&&&&&&&%(&&&&&&%     &., /&&&&&@&&&&&&&&&&&&&@                    \n" +
                        "          /&(&&&&&&&&#(&&&&&&&&&&&@,&&&&&&&@#&&&(*&&&&&&&@                      \n" +
                        "           &##&&&&&&&&&&@%(*,.  .,*#&&%&&.##  ##   (&,,                         \n" +
                        "           &%(&&&&&&&&             .&&&&&  &.       &/                          \n" +
                        "           &%(&&&&&&&&             .#&&&&/ #,.......&.                          \n" +
                        "           %&&&&&&&&&&%            .,&&&&&(  .&&&@&@                            \n" +
                        "              &&&&&&&&&            ..&%%%                                       \n" +
                        "             *&&&&&&&&&%           ..&&.&                                       \n" +
                        "             &&&&&&&&&&&.           .&&#&.                                      \n" +
                        "            &&&&&&&&&&&&&          ..&&@                                        \n" +
                        "           %&&&&&&&&&&&&&&&&&&&&&&&&&&&@                                        \n" +
                        "          *&&&&&&&&&&&&&&&&&&&&&&&.&&&&%                                        \n");
                break;
            case 6:
                listener.getLogger().println("                                                                                \n" +
                        "                  /@  @*            .*((/,.                                     \n" +
                        "                  /@  @/      *@&/////**//////%@&                               \n" +
                        "               @  /@  @/  @,@//,..............*////@/                           \n" +
                        "               @&@@@@@@@@&@/*....................*///%&                         \n" +
                        "            @@###########@/,.......................*///@                        \n" +
                        "          @&############@/,..........................///@.                      \n" +
                        "     @@@@@#############%&/...,@@@@#...................///@                      \n" +
                        "     ...@##############&(*.,@%........................,//&*                     \n" +
                        "       .@##############&#*.(..,////*...................//(%                     \n" +
                        " @&@&&&%@###############@/...///@@@@@/*.............%%@@@/&                     \n" +
                        "     %%%&@##############@/,..//@@@   (@/*...........,///*@(                     \n" +
                        "          @&#############@/../(@@@@(   @@/.........*/@@@*@                      \n" +
                        "            @@############@/../@@@@@@@@@@@*.......*@/ @@&/                      \n" +
                        "               @@@@@@@@@@@@@*..*@@@@@@@@&@#,......&@@@@%%                       \n" +
                        "               @/  @  &&  @.@#*...&@&%%%&@,.......%@@/@.                        \n" +
                        "                   @  %&      @(*.......*.......#,*/@(                          \n" +
                        "                   @  %&     %@@@@/*.....&/....*/#@%#@@                         \n" +
                        "                         @@%####/&& &@@(*/*//&@@@#((@(##@@                      \n" +
                        "                      @@%%@/*********/&####%@&#@(###@***@,                      \n" +
                        "                      .@&%%%%%@/******&(###&&/#**/#****/&                       \n" +
                        "                       ,@#(******(@****(#*****/*&@@*#*/@                        \n" +
                        "                        (@#*******&(**********/*/(((//@   */                    \n" +
                        "                         @#/****@(&(***/((##%&@@@@@@@@@%,...,@                  \n" +
                        "                         @&(**@@@#@        (%  ,%#%@./%.#@@*.#@                 \n" +
                        "              .@@#     @&@@%&/@&**#.* .&%   &  ,%**@*,@**,,,,/@                 \n" +
                        "            *%@@@&%%%%#@*#@@&@*****#    *     %(@**@@@@@@%%&@@&@@@&#%/          \n" +
                        "      #@@%%%%%%%%%#((((@*****#@@@&%@   . ..    .@.%%***(/*@#((((((((((#@@%      \n" +
                        "    @%%%%@###@%%%(((((((#@@%*/@%*%@@%.@     /  .@..@@/**&@#(((((((((((%@#%@(@@  \n" +
                        "    *@&%%@&%@&%%%%%%##@&((((((((#&@@@*   #. &(%.%@@@%((((((((###((((((@%%%@#(#@ \n" +
                        "      #@%@@%%%%%%%%%@%##%%#((((((%@@#@@@@#//(#&@@@@@#(((((((@%##%#(((((((#@@@(  \n" +
                        "         *@@/*#@@@&%%%&%%%%%%%%%@%##%%((((((((((@%##&%(((((((#&&((#&@@%/#@#     \n" +
                        "               /@@&(***//%@@@@@@@&&%%%%%##((((((((##((%&@@@@@#/***%@@(          \n" +
                        "                        .@@@@@@@@@&#/****************(%@@@@@#                   \n" +
                        "                              &@@@%%%%#((((((##%@@@#                            \n" +
                        "                                                                                ");
                break;
            case 7:
                listener.getLogger().println("                                        *#&@@@%                                 \n" +
                        "                             .&@@@@@@@@&&&&&&&&@@@@@%*                          \n" +
                        "                          *@@@&&&&&&&&&&&&&&&&&&&&&&&&@@@@&,                    \n" +
                        "                       .@@@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@@/                 \n" +
                        "                   %@@@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@(               \n" +
                        "                 *@@&&&&&&&&&&&&&&&&&&&&@@@@@@@@@@@@@@&&&&&&&&&&@@              \n" +
                        "               ,@@&&&&&&&&&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&@&             \n" +
                        "             @@@&&&&&&&&&&&&&&@@@@@@@@@#*..............@@@@@&&&&&@&             \n" +
                        "           .@@&&&&&&&&&&&&&@@@@@@@#..&@@#............(@@@@@@@&&&@@/.   *  /     \n" +
                        "@.         @@&&&&&&&&&&&@@@@@(....*@/......................@@@@@%@&@& ,@  @(    \n" +
                        "@@@&      @@@&&&&&&&&&@@@@#@,.....(.........................@.  @@#&@*@@,,@@*   \n" +
                        "@&##%@%,@@&@&&&&&&&&&@@#(((&..............*(.....,#......#,.@/ @&####@%&@@%&@   \n" +
                        " /@&###&##@@&&&&&&&@@@@@%((%................@*....%@...%&&&(@@@&#####%##@%##&@  \n" +
                        " .@@#####@@@@&&&&@@% .../@%&.............(#(........@&......&@@#############&@@&\n" +
                        "@&#########%@&,(&@/..&/#%/%(.........................,@@....@%#################@\n" +
                        "@&#@##########@@@@%..%.................................&@..,@##################@\n" +
                        "@@@########@@@@@@@@@..........................*@...#@@(....&&##################@\n" +
                        "@@&################%@@@@@*................*@#/,,,,,.*#@@&.#@###################@\n" +
                        "@&#####################@@ ....../........*%....*/(#,*,...%@####################@\n" +
                        "@#                     @@#@@@,...@,........*@@@@@@@@,..,@@(                    @\n" +
                        "@%                     &@&@@&(&@@(.@(.................@@&@@.                   @\n" +
                        "/@                   ,@@@@&&&&@@@(&@@@@&/.........%@@@#&@@@@@                  @\n" +
                        " @               *@@@&&&&&&&&&&&&&@@@@@&((@@@@@@#*@@#(@@&&&&@@@/              *@\n" +
                        " #&          (@@@@&&&&&&&&&&&&&&&&&&&&&&&&@@@(@@@@&%@&&&&&&&&&@%              @*\n" +
                        "  @*        (@@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@&%@@%@&&&&&&&&&@@              #% \n" +
                        "   @.        @@@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@@@@&&&&&&&&&&@              (&  \n" +
                        "    @*        @@&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@@@@&&&&&&&&&@*             #&   \n" +
                        "     %@########@@&&&&&&&&&&&&@@&&&&&&&&&&&&&&&&&@@@&&&&&&&&@&#############@/    \n" +
                        "       @########@@&&&&&&&&&&&@&&&&&&&&&&&&&&&&&&@@@&&&&&&&@@############%@      \n" +
                        "        *@######&@&&&&&&&&&&&@&&&&&&&&&&&&&&&&&&@@@&&&&&@@@@@@@&,  @@%%@.       \n" +
                        "          ,@%####@@&&&&&&&&@@@@@@@@@@@&&%####%&@@@@@@@@#(@&   /%,   (@*         \n" +
                        "             @@##@@&&&&&&&&&&&@             .*#%*&&&&@@* .@. *@@&(   @@         \n" +
                        "                &@@&&&&&&&&&&&@,*@&%##@@@@@####%%#@&&@@%  @/ *(###* ./@         \n" +
                        "                 %@&&&&&&&&&&&@# @####&@  %%####@/@&&&@@..&#...,,....@%         \n" +
                        "                 *@@@@&&&&&&&&&@ &####%@@@@@####@,@&&&@@&..  #@@@@@@@           \n" +
                        "                     /@@@@@@&&&@(*@####@#,.@####@.@/.@@                         \n" +
                        "                          ./%&&@@ /&###@@@@@%##&/.@../@                         \n" +
                        "                               .@#  @%#%@ ,,&#@...@...@%                        \n" +
                        "                                /@,   /@@@@@@,   .&@@@@/                        \n" +
                        "                                 %@.           .../@.                           \n" +
                        "                                  /@@@@@@@@@@@@@@@@,                            ");
                break;
            case 8:
                listener.getLogger().println("                                                                               \n" +
                        "                                    (&@@@&#.                                    \n" +
                        "                                 &&((****..*(&,                                 \n" +
                        "                               /&((********* ./&                                \n" +
                        "                               @((***********.*%,                               \n" +
                        "                               &%&&&*******&#&&&                                \n" +
                        "                            #&&((&&%********(&&#(&&#                            \n" +
                        "                       *&@#(%&&.  #&&#&&&&&&&&&%*&&%(%&&                        \n" +
                        "      (&&%#(#%&@(  %&&((&&#    .&&#,&# . ........%&@ %@%(%&@.    (@&&&&&@%.     \n" +
                        "   .&#(******,  **&%&&.     *&(.(%,.................&&,  (&&((&&((*****  **#&   \n" +
                        "  (@((**********  *(#      &&&&#&......*@*.........&&&&&     &((*********. ,*&/ \n" +
                        "  @((************.**@    #&,/(((&....&,................&/   @#(/*********** **@ \n" +
                        "  @#(/*********&&&@/@    @#((((#(..........(..../....*.*&   @#(%*************/@ \n" +
                        "   @#((*********%&&(#&&/ &%&&&##*........,..@...,&..&&&,&.&@&((&&***********(&* \n" +
                        "    .@&(((//*//(&@, /&&##&.%&(/&&.................#%....&(&&&.#&#(((//*//((&&   \n" +
                        "        .%&&&&&         #&.,,.,.....................&/.(%        .@&&&&@&*      \n" +
                        "           (&(&          %&,..,...............&(#&%,.,.&         (&(@           \n" +
                        "            @(&/           .&&*...........%.(&&&&*&&..@/         &#%&           \n" +
                        "            &%%&             &&.....%......,&&&&&&..,&,          &(&,           \n" +
                        "            *&(&.            ,&&......%/..........*&&&&.        #&(@            \n" +
                        "             &(&#        /@&%(((&&&%(*&@&&&&&&@&&&&&&#(&&&  *&@@&(&%            \n" +
                        "          ,&&%&&%*/%&%&&&(((#%%%%%%%&&%####(%&#&((##%%%%#&&(****&&&*&&          \n" +
                        "        .&(/*******.&%&#(#%%%%%%%%%%%%&######&&#&&%#&%%%&%(&******* .*&,        \n" +
                        "        @(/********** (&#(%%%%%%%%%%%%%%#&&**&,, %**/%%%&/**********.*/&        \n" +
                        "        @(/************#&(#%%%%%%%%#%%%%&*****%* &*&%%%&((************#&        \n" +
                        "        (&(/********&%%&&%#%%%%%%%##%%%%%%%&&&/%%#%%%%&&&&&%&&*******%@         \n" +
                        "          %&#(/****/&@%&&&(%%%%%&&&&@@&%(////(#&&&&&/#%  #*   &(((#&&#          \n" +
                        "          .@. &%%&.     ,&##%%%%%%&            .&%%&. @       &&(#&..&.         \n" +
                        "          &* &#(#@       &##%%%%%%&            .&%%&&.#,......&@((#&./@         \n" +
                        "         %& &#((&#       @&&&%%%%%%(           .&%&&&.  ,&&&&& @%((%&.&(        \n" +
                        "         &.&%(((&.           *&&&&&@           .(..&           ,@(((%& &        \n" +
                        "        &*&%(((#@                &&%#          ./,.&&           @((((&&#&       \n" +
                        "       (@&&((((&#                  .&,          ,&&%            %&((((&%&/      \n" +
                        "       @%&((((((.                   ,&&&&&&%%&&&&&              ,&(((((&%@      \n" +
                        "                                                                                ");
                break;
            case 9:
                listener.getLogger().println("                                                                               \n" +
                        "                                    (&@@@&#.                                    \n" +
                        "                                 &&((****..*(&,                                 \n" +
                        "                               /&((********* ./&                                \n" +
                        "                               @((***********.*%,                               \n" +
                        "                               &%&&&*******&#&&&                                \n" +
                        "                            #&&((&&%********(&&#(&&#                            \n" +
                        "                       *&@#(%&&.  #&&#&&&&&&&&&%*&&%(%&&                        \n" +
                        "      (&&%#(#%&@(  %&&((&&#    .&&#,&# . ........%&@ %@%(%&@.    (@&&&&&@%.     \n" +
                        "   .&#(******,  **&%&&.     *&(.(%,.................&&,  (&&((&&((*****  **#&   \n" +
                        "  (@((**********  *(#      &&&&#&......*@*.........&&&&&     &((*********. ,*&/ \n" +
                        "  @((************.**@    #&,/(((&....&,................&/   @#(/*********** **@ \n" +
                        "  @#(/*********&&&@/@    @#((((#(..........(..../....*.*&   @#(%*************/@ \n" +
                        "   @#((*********%&&(#&&/ &%&&&##*........,..@...,&..&&&,&.&@&((&&***********(&* \n" +
                        "    .@&(((//*//(&@, /&&##&.%&(/&&.................#%....&(&&&.#&#(((//*//((&&   \n" +
                        "        .%&&&&&         #&.,,.,.....................&/.(%        .@&&&&@&*      \n" +
                        "           (&(&          %&,..,...............&(#&%,.,.&         (&(@           \n" +
                        "            @(&/           .&&*...........%.(&&&&*&&..@/         &#%&           \n" +
                        "            &%%&             &&.....%......,&&&&&&..,&,          &(&,           \n" +
                        "            *&(&.            ,&&......%/..........*&&&&.        #&(@            \n" +
                        "             &(&#        /@&%(((&&&%(*&@&&&&&&@&&&&&&#(&&&  *&@@&(&%            \n" +
                        "          ,&&%&&%*/%&%&&&(((#%%%%%%%&&%####(%&#&((##%%%%#&&(****&&&*&&          \n" +
                        "        .&(/*******.&%&#(#%%%%%%%%%%%%&######&&#&&%#&%%%&%(&******* .*&,        \n" +
                        "        @(/********** (&#(%%%%%%%%%%%%%%#&&**&,, %**/%%%&/**********.*/&        \n" +
                        "        @(/************#&(#%%%%%%%%#%%%%&*****%* &*&%%%&((************#&        \n" +
                        "        (&(/********&%%&&%#%%%%%%%##%%%%%%%&&&/%%#%%%%&&&&&%&&*******%@         \n" +
                        "          %&#(/****/&@%&&&(%%%%%&&&&@@&%(////(#&&&&&/#%  #*   &(((#&&#          \n" +
                        "          .@. &%%&.     ,&##%%%%%%&            .&%%&. @       &&(#&..&.         \n" +
                        "          &* &#(#@       &##%%%%%%&            .&%%&&.#,......&@((#&./@         \n" +
                        "         %& &#((&#       @&&&%%%%%%(           .&%&&&.  ,&&&&& @%((%&.&(        \n" +
                        "         &.&%(((&.           *&&&&&@           .(..&           ,@(((%& &        \n" +
                        "        &*&%(((#@                &&%#          ./,.&&           @((((&&#&       \n" +
                        "       (@&&((((&#                  .&,          ,&&%            %&((((&%&/      \n" +
                        "       @%&((((((.                   ,&&&&&&%%&&&&&              ,&(((((&%@      \n" +
                        "                                                                                ");
                break;
        }
    }

    @Symbol("greet")
    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }

        @Override
        public String getDisplayName() {
            return "Ascii Art Magician";
        }

    }

}
