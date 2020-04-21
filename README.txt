PlayerProfiles is a lightweight data plugin. This plugin automatically creates a profile for each player that joins the server to log the following

Information:
- Player Name
- UUID
- Join Date
- Date Last Disconnected
- Player Counter



This file can be found in your plugins folder inside a folder titled 'PlayerProfiles' under the document 'Profiles'


Please do not modify any of the information found in the 'Profiles' file



--------------------------------------------------------------------------------------------------
Example File:

players:
  CobaltGecko121:
    uuid: e4ba4fc0-43e6-4657-b13e-8ef29def0e58
    counter: 1
    first-join: '2020-04-21'
    leave-date: '2020-04-21'
  BuffaloBear122:
    uuid: 49be9d18-1f4e-49b4-bea8-56474a0a3fe4
    counter: 2
    first-join: '2020-04-21'
    leave-date: '2020-04-21'
data:
  players-joined: 2
--------------------------------------------------------------------------------------------------


Players will only be added to this file AFTER the plugin has been installed.
It cannot automatically create profiles for everyone that has ever joined the server before its installation.


The plugin also tracks the total amount of unique players that have ever joined your server

This information allows you to quickly see information about people who have joined your server.

If you're searching for a specific player I suggest using the Ctrl+F and searching for their name in the file.

If you have anything you would like to see added to this plugin please feel free to comment or message me on Discord!

Discord: CobaltGecko#5302